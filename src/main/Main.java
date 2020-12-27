package main;

import java.sql.SQLException;

import dao.NhanVienDAO;
import database.ConectDatabase;
import entities.TaiKhoan;
import gui.FrmThemTaiKhoan;
import xuly.CountDownThread;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		try {
			ConectDatabase.getInstance().connect();
			NhanVienDAO nvDao = new NhanVienDAO();
			nvDao.addTaiKhoan(new TaiKhoan("Nhat","123456"));
			//ConectDatabase.getInstance().connect();
			//CountDownThread couDownThread=new CountDownThread();
			CountDownThread countDownThread=new CountDownThread();
			//couDownThread.start();
			countDownThread.start();
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
