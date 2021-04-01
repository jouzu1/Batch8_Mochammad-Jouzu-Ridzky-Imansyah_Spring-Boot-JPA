package com.ujian.jpa.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "matakuliah")
public class MataKuliah {
	@Id
	@Column(name ="id_matakuliah",nullable = false, columnDefinition="char(10)")
	private String id_matakuliah;
	
	@Column(name ="nama_matakuliah",nullable = false, length = 25)
	private String nama_matakuliah;
	
//	@ManyToMany(mappedBy = "mahasiswa,dosen")
//	private Set<Dosen> dosen = new HashSet<Dosen>();
//	private Set<Mahasiswa> mahasiswa = new HashSet<Mahasiswa>() ;
	
//	private Mahasiswa mahasiswa;
//	private Dosen dosen;
	
	@ManyToMany(mappedBy="matakuliah")
	private List<Mahasiswa> mahasiswa = new ArrayList<Mahasiswa>();
}
