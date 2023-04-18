package banco.cuenta;

import java.time.LocalDate;

public class Movimiento {


		// TODO Auto-generated method stub

		private LocalDate fecha;
		private String concepto;
		private double mImporte;

		//contructor
		
		public Movimiento()
		{
			// la fecha r4ecoge la fecha actual 
			fecha = LocalDate.now();
			
		}
		
		//aqui val los get y set 

		public LocalDate getFecha() {
			return fecha;
		}

		public void setFecha(LocalDate fecha) {
			this.fecha = fecha;
		}

		public String getConcepto() {
			return concepto;
		}

		public void setConcepto(String concepto) {
			this.concepto = concepto;
		}

		public double getmImporte() {
			return mImporte;
		}

		public void setmImporte(double mImporte) {
			this.mImporte = mImporte;
		}
	
	
		

}
