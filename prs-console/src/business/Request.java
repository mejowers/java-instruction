package business;

import java.time.LocalDate;

public class Request {
	
	private int id;
	private User user;
	private String desc;
	private String just;
	private LocalDate dateNeeded;
	private String status;
	private double total;
	private LocalDate dateSubmitted;
	private String rsnForRejection;
	
	public Request() {
		super();
	}

	public Request(int id, User user, String desc, String just, LocalDate dateNeeded, String status, double total,
			LocalDate dateSubmitted, String rsnForRejection) {
		super();
		this.id = id;
		this.user = user;
		this.desc = desc;
		this.just = just;
		this.dateNeeded = dateNeeded;
		this.status = status;
		this.total = total;
		this.dateSubmitted = dateSubmitted;
		this.rsnForRejection = rsnForRejection;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	/**
	 * @return the just
	 */
	public String getJust() {
		return just;
	}

	/**
	 * @param just the just to set
	 */
	public void setJust(String just) {
		this.just = just;
	}

	/**
	 * @return the dateNeeded
	 */
	public LocalDate getDateNeeded() {
		return dateNeeded;
	}

	/**
	 * @param dateNeeded the dateNeeded to set
	 */
	public void setDateNeeded(LocalDate dateNeeded) {
		this.dateNeeded = dateNeeded;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the total
	 */
	public double getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(double total) {
		this.total = total;
	}

	/**
	 * @return the dateSubmitted
	 */
	public LocalDate getDateSubmitted() {
		return dateSubmitted;
	}

	/**
	 * @param dateSubmitted the dateSubmitted to set
	 */
	public void setDateSubmitted(LocalDate dateSubmitted) {
		this.dateSubmitted = dateSubmitted;
	}

	/**
	 * @return the rsnForRejection
	 */
	public String getRsnForRejection() {
		return rsnForRejection;
	}

	/**
	 * @param rsnForRejection the rsnForRejection to set
	 */
	public void setRsnForRejection(String rsnForRejection) {
		this.rsnForRejection = rsnForRejection;
	}

	@Override
	public String toString() {
		return "Request [id=" + id + ", user=" + user + ", desc=" + desc + ", just=" + just + ", dateNeeded="
				+ dateNeeded + ", status=" + status + ", total=" + total + ", dateSubmitted=" + dateSubmitted
				+ ", rsnForRejection=" + rsnForRejection + "]";
	}
	
	
	

}
