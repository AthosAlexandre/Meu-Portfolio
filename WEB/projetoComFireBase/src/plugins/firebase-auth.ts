import { app } from "./firebase.ts";
import { getAuth } from "firebase/auth";

const auth = getAuth(app);
export default auth;
