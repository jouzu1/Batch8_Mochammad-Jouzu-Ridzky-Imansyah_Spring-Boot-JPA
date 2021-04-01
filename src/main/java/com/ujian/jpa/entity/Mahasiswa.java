package com.ujian.jpa.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
@Table(name = "mahasiswa")
public class Mahasiswa {
	@Id
	@Column(name = "nim", nullable = false, columnDefinition = "char(8)")
	private String nim;

	@Column(name = "nama_mahasiswa", nullable = false, length = 25)
	private String nama_mahasiswa;

	@Column(name = "jenis_kelamin", nullable = false, length = 10)
	private String jenis_kelamin;

	@Column(name = "password", nullable = false, length = 25)
	private String password;

//	@ManyToMany(mappedBy = "mahasiswa")
//	private Set<Dosen> dosen = new HashSet<Dosen>();
//	private Set<MataKuliah> matakuliah = new HashSet<MataKuliah>();

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "plot_dosen", joinColumns = {
			@JoinColumn(name = "nim", referencedColumnName = "nim", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "id_dosen", referencedColumnName = "id_dosen", nullable = false, updatable = false), })
	private List<Dosen> dosen = new ArrayList<Dosen>();

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "plot_mata_kuliah", joinColumns = {
			@JoinColumn(name = "nim", referencedColumnName = "nim", nullable = false, updatable = false) },
			inverseJoinColumns = {
					@JoinColumn(name = "id_matakuliah", referencedColumnName = "id_matakuliah", nullable = false, updatable = false)})
	private List<MataKuliah> matakuliah = new ArrayList<MataKuliah>();
	
	
	
//	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	@JoinTable(name = "plot_dosen", joinColumns = {
//			@JoinColumn(name = "nim", referencedColumnName = "nim", nullable = false, updatable = false) }, inverseJoinColumns = {
//					@JoinColumn(name = "id_dosen", referencedColumnName = "id_dosen", nullable = false, updatable = false),
//					@JoinColumn(name = "id_matakuliah", referencedColumnName = "id_matakuliah", nullable = false, updatable = false),})
//	private List<Dosen> dosen = new ArrayList<Dosen>();
//	private List<MataKuliah> matakuliah = new ArrayList<MataKuliah>();
	
}
