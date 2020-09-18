package requests

class GetPlacesRequest (var latitude: Float, var longitude: Float, var filters: List<String>) {



    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as GetPlacesRequest

        if (latitude != other.latitude) return false
        if (longitude != other.longitude) return false
        if (filters != other.filters) return false

        return true
    }
}