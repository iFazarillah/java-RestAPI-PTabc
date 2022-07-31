package com.abc.abc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.abc.abc.model.Karyawan;
import com.abc.abc.service.KaryawanService;

@Service
public class ImplKaryawan implements KaryawanService {
	static List<Karyawan> listKaryawan = new ArrayList<>();

	@Override
	public Karyawan save(Karyawan kry) {
		// TODO Auto-generated method stub

		kry.setId(1L);
		listKaryawan.add(kry);
		return kry;
	}

	@Override
	public Karyawan update(Karyawan kry) {
		for (Karyawan data : listKaryawan) {
			if (kry.getId() == data.getId()) {
				Karyawan update = new Karyawan();
				update.setNama(data.getNama());
				update.setId(data.getId());
				update.setJk(data.getJk());
				update.setDob(data.getDob());
				update.setAlamat(data.getAlamat());
				update.setStatus(data.getStatus());
				listKaryawan.remove(data);
				listKaryawan.add(update);
				return update;
			}
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Karyawan> deleted(Long id) {
		// TODO Auto-generated method stub
		for (Karyawan data : listKaryawan) {
			if (id == data.getId()) {
				Karyawan update = new Karyawan();
				update.setNama(data.getNama());
				update.setId(data.getId());
				update.setJk(data.getJk());
				update.setDob(data.getDob());
				update.setAlamat(data.getAlamat());
				update.setStatus(data.getStatus());
				listKaryawan.remove(data);

				return listKaryawan;
			}
		}
		return null;
	}

	public List<Karyawan> dataKaryawan(int row, int page) {
		// TODO Auto-generated method stub
		return listKaryawan;

	}

	@Override
	public Karyawan findById(long kry) {
		// TODO Auto-generated method stub
		for (Karyawan data : listKaryawan) {
			if (kry == data.getId()) {
				return data;
			}
		}
		return null;
	}

}
