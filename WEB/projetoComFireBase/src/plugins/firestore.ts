import { app } from './firebase.ts'
import { getFirestore} from 'firebase/firestore'

export const db = getFirestore(app);
export default db;