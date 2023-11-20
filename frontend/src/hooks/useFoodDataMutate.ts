import axios, {AxiosPromise} from "axios";
import {FoodData} from "../interface/FoodData.ts";
import {useMutation, useQueryClient} from "react-query";

const API_URL:  string = "http://localhost:8080"

const postDate = async (data: FoodData) : AxiosPromise<never> => {
    return axios.post(API_URL + "/food", data)
}

export function useFoodDataMutate() {
    const queryClient = useQueryClient()
    const mutate = useMutation({
        mutationFn: postDate,
        retry: 2,
        onSuccess: () => {
            queryClient.invalidateQueries('food-data')
        }
    })

    return mutate
}
