package id_27625.q5;


import java.util.Date;

    public class Entity {
        private int id;
        private Date createdDate;
        private Date updatedDate;

        public Entity(int id) throws AttendanceDataException {
            if (id <= 0) throw new AttendanceDataException("ID must be greater than 0.");
            this.id = id;
            this.createdDate = new Date();
            this.updatedDate = new Date();
        }

        public int getId() {
            return id;
        }
    }

