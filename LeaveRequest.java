package id_27625.q5;

import java.util.Date;

    public class LeaveRequest {
        private Date requestDate;
        private String reason;
        private boolean approved;
        private String studentID;  // Optional: link to the student who requested leave

        // Constructor

        public LeaveRequest(Date requestDate, String reason, boolean approved, String studentID) {
            this.requestDate = requestDate;
            this.reason = reason;
            this.approved = approved;
            this.studentID = studentID;
        }

        // Getters and Setters
        public Date getRequestDate() {
            return requestDate;
        }

        public String getReason() {
            return reason;
        }

        public boolean isApproved() {
            return approved;
        }

        public String getStudentID() {
            return studentID;
        }

        public void setApproved(boolean approved) {
            this.approved = approved;
        }

        // Display leave request
        public void displayLeaveRequest() {
            System.out.println("----- LEAVE REQUEST -----");
            System.out.println("Student ID: " + studentID);
            System.out.println("Request Date: " + requestDate);
            System.out.println("Reason: " + reason);
            System.out.println("Approved: " + approved);
        }
    }
