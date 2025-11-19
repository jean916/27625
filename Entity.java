package id_27625.q6;

import java.util.Date;

    public class Entity {
        private int id;
        private Date createdDate;
        private Date updatedDate;

        public Entity(int id) throws PayrollDataException {
            if (id <= 0) throw new PayrollDataException("ID must be greater than 0.");
            this.id = id;
            this.createdDate = new Date();
            this.updatedDate = new Date();
        }

        public int getId() {
            return id;
        }
    }

