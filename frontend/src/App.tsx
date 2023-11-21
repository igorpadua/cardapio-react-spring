import './App.css'
import {Card} from "./components/card/card.tsx";
import {useFoodData} from "./hooks/useFoodData.ts";
import {useState} from "react";
import {CreateModal} from "./components/create-modal/create-modal.tsx";

function App() {
    const {data} = useFoodData()
    const [iosModalOpen, setIosModalOpen] = useState(false)

    const handleOpenModal = () => {
        setIosModalOpen(prev => !prev)
    }

    return (
        <div className="container">
            <h1>Cardápio</h1>
            <div className="card-grid">
                {data?.map(foodData =>
                    <Card
                        price={foodData.price}
                        title={foodData.title}
                        image={foodData.image}
                    />
                )}
                {iosModalOpen && <CreateModal/>}
                <button onClick={handleOpenModal}>Novo</button>
            </div>
        </div>
    )
}

export default App
