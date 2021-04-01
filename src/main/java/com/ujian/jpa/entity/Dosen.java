package com.ujian.jpa.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "dosen")
public class Dosen {
	@Id
	@Column(name = "id_dosen", nullable = false, columnDefinition = "char(10)")
	private String id_dosen;

	@Column(name = "username", nullable = false, length = 25)
	private String username;

	@Column(name = "password", nullable = false, length = 25)
	private String password;

	@Column(name = "nama_dosen", nullable = false, length = 25)
	private String nama_dosen;

//	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	@JoinTable(name = "plot_mata_kuliah", joinColumns = {
//			@JoinColumn(name = "id_matakuliah", referencedColumnName = "id_matakuliah", nullable = false, updatable = false) },
//			inverseJoinColumns = {
//					@JoinColumn(name = "id_dosen", referencedColumnName = "id_dosen", nullable = false, updatable = false)})
//
//	private List<Mahasiswa> mahasiswa = new ArrayList<Mahasiswa>();
//	private List<MataKuliah> matakuliah = new ArrayList<MataKuliah>();
//	
//	private Mahasiswa mahasiswa;
//	private MataKuliah matakuliah;
	
	@ManyToMany(mappedBy="dosen")
	private List<Mahasiswa> mahasiswa = new ArrayList<Mahasiswa>();
}
