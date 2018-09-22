package com.zd.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.zd.entity.Stu;

public interface IStuDao {

	//��ѯȫ��
	@Select("select * from stu")
	@ResultMap("stuMapper")
	public List<Stu> selAll();
	
	//���
	@Insert("insert into stu value(null,#{sname},#{ssex},#{sage})")
	public void add(Stu stu);
	
	//ɾ��
	@Delete("delete from stu where sid=#{sid}")
	public void delete(int sid);
	
	//�鵥��
	@Select("select * from stu where sid=#{sid}")
	@ResultMap("stuMapper")
	public Stu selOne(int sid);
	
	//�޸�
	@Update("update stu set sname=#{sname},ssex=#{ssex},sage=#{sage} where sid=#{sid}")
	public void update(Stu stu);
}
