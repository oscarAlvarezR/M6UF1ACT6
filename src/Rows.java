/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
class Rows {
	
	private Row[] row;

	public Row[] getRow() {
		return row;
	}

	public void setRow(Row[] row) {
		this.row = row;
	}
}
