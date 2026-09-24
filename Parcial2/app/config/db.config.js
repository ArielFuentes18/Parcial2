module.exports = {
  HOST: "ep-morning-block-ayeu8mrq-pooler.c-5.us-east-2.aws.neon.tech",
  USER: "neondb_owner",
  PASSWORD: "npg_RSfNb8n2AoJH",
  DB: "neondb",
  dialect: "postgres",
  pool: {
    max: 5,
    min: 0,
    acquire: 30000,
    idle: 10000
  }
};