package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * RhempregadobenefId generated by hbm2java
 */
@Embeddable
public class RhempregadobenefId implements java.io.Serializable {

	private int matempr;
	private short codfilial;
	private int codemp;
	private int codbenef;
	private short codfilialbn;
	private int codempbn;

	public RhempregadobenefId() {
	}

	public RhempregadobenefId(int matempr, short codfilial, int codemp,
			int codbenef, short codfilialbn, int codempbn) {
		this.matempr = matempr;
		this.codfilial = codfilial;
		this.codemp = codemp;
		this.codbenef = codbenef;
		this.codfilialbn = codfilialbn;
		this.codempbn = codempbn;
	}

	@Column(name = "MATEMPR", nullable = false)
	public int getMatempr() {
		return this.matempr;
	}

	public void setMatempr(int matempr) {
		this.matempr = matempr;
	}

	@Column(name = "CODFILIAL", nullable = false)
	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

	@Column(name = "CODEMP", nullable = false)
	public int getCodemp() {
		return this.codemp;
	}

	public void setCodemp(int codemp) {
		this.codemp = codemp;
	}

	@Column(name = "CODBENEF", nullable = false)
	public int getCodbenef() {
		return this.codbenef;
	}

	public void setCodbenef(int codbenef) {
		this.codbenef = codbenef;
	}

	@Column(name = "CODFILIALBN", nullable = false)
	public short getCodfilialbn() {
		return this.codfilialbn;
	}

	public void setCodfilialbn(short codfilialbn) {
		this.codfilialbn = codfilialbn;
	}

	@Column(name = "CODEMPBN", nullable = false)
	public int getCodempbn() {
		return this.codempbn;
	}

	public void setCodempbn(int codempbn) {
		this.codempbn = codempbn;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RhempregadobenefId))
			return false;
		RhempregadobenefId castOther = (RhempregadobenefId) other;

		return (this.getMatempr() == castOther.getMatempr())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp())
				&& (this.getCodbenef() == castOther.getCodbenef())
				&& (this.getCodfilialbn() == castOther.getCodfilialbn())
				&& (this.getCodempbn() == castOther.getCodempbn());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getMatempr();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		result = 37 * result + this.getCodbenef();
		result = 37 * result + this.getCodfilialbn();
		result = 37 * result + this.getCodempbn();
		return result;
	}

}