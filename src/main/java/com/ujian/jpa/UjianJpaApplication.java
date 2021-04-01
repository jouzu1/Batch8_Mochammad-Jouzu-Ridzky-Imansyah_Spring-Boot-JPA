package com.ujian.jpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ujian.jpa.entity.Dosen;
import com.ujian.jpa.entity.Mahasiswa;
import com.ujian.jpa.entity.MataKuliah;

import com.ujian.jpa.repo.AdminRepo;
import com.ujian.jpa.repo.DosenRepo;
import com.ujian.jpa.repo.MKRepo;
import com.ujian.jpa.repo.MahasiswaRepo;


@SpringBootApplication
public class UjianJpaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(UjianJpaApplication.class, args);
	}

	@Autowired
	AdminRepo adminRepo;
	
	@Autowired
	DosenRepo dr;
	
	@Autowired
	MahasiswaRepo mr;
	
	@Autowired
	MKRepo mkr;
	

	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		/**
		 * Membuat admin baru tanpa ada relasi
		 */
		
		/*Admin adminElektro = new Admin("Jouzu","apaAjaBoleh");
		Admin adminIT = new Admin ("Bambang","1234");
		List<Admin> lstadm = new ArrayList<Admin>();
		lstadm.add(adminElektro);
		lstadm.add(adminIT);
		this.adminRepo.saveAll(lstadm);*/
		
		
		/**
		 * Membuat objek mahasiswa, dosen, dan mata kuliah
		 */
		Mahasiswa mahasiswa = new Mahasiswa();
		mahasiswa.setNim("123");
		mahasiswa.setPassword("qwerty");
		mahasiswa.setJenis_kelamin("Laki-laki");
		mahasiswa.setNama_mahasiswa("Budi");
		
		Dosen dosen = new Dosen();
		dosen.setId_dosen("A1");
		dosen.setUsername("dadang");
		dosen.setPassword("keluargaituutama");
		dosen.setPassword("thedunk");
		dosen.setNama_dosen("Dadang Surdadang");
		
		Dosen dosen1 = new Dosen();
		dosen1.setId_dosen("A2");
		dosen1.setUsername("dudung");
		dosen1.setPassword("aselolejos");
		dosen1.setPassword("asep");
		dosen1.setNama_dosen("Dudung Kasbor");
		
		MataKuliah matakuliah = new MataKuliah();
		matakuliah.setId_matakuliah("MTK01");
		matakuliah.setNama_matakuliah("Matematika Dasar");
		
		MataKuliah matakuliah1 = new MataKuliah();
		matakuliah1.setId_matakuliah("SISTEL101");
		matakuliah1.setNama_matakuliah("Sistem Telekomunikasi");
		
		
		
		List<Dosen> listdosen = new ArrayList<Dosen>();
		listdosen.add(dosen);
		listdosen.add(dosen1);
		mahasiswa.setDosen(listdosen);
		
		
		List<Mahasiswa> listmahasiswa = new ArrayList<Mahasiswa>();
		listmahasiswa.add(mahasiswa);
		dosen.setMahasiswa(listmahasiswa);
		dosen1.setMahasiswa(listmahasiswa);
		
		
		List<MataKuliah> listmatakuliah = new ArrayList<MataKuliah>();
		listmatakuliah.add(matakuliah);
		listmatakuliah.add(matakuliah1);
		matakuliah.setMahasiswa(listmahasiswa);
		mahasiswa.setMatakuliah(listmatakuliah);
		
		
		this.mr.saveAll(listmahasiswa);
		this.dr.saveAll(listdosen);
		this.mkr.saveAll(listmatakuliah);
		
	}

}
