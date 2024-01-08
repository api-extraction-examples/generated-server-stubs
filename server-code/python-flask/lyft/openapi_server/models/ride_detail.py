from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.cancellation_cost import CancellationCost
from openapi_server.models.cost import Cost
from openapi_server.models.current_ride_location import CurrentRideLocation
from openapi_server.models.driver_detail import DriverDetail
from openapi_server.models.line_item import LineItem
from openapi_server.models.passenger_detail import PassengerDetail
from openapi_server.models.pickup_dropoff_location import PickupDropoffLocation
from openapi_server.models.ride_location import RideLocation
from openapi_server.models.ride_profile_enum import RideProfileEnum
from openapi_server.models.ride_status_enum import RideStatusEnum
from openapi_server.models.ride_type_enum_with_other import RideTypeEnumWithOther
from openapi_server.models.vehicle_detail import VehicleDetail
from openapi_server import util

from openapi_server.models.cancellation_cost import CancellationCost  # noqa: E501
from openapi_server.models.cost import Cost  # noqa: E501
from openapi_server.models.current_ride_location import CurrentRideLocation  # noqa: E501
from openapi_server.models.driver_detail import DriverDetail  # noqa: E501
from openapi_server.models.line_item import LineItem  # noqa: E501
from openapi_server.models.passenger_detail import PassengerDetail  # noqa: E501
from openapi_server.models.pickup_dropoff_location import PickupDropoffLocation  # noqa: E501
from openapi_server.models.ride_location import RideLocation  # noqa: E501
from openapi_server.models.ride_profile_enum import RideProfileEnum  # noqa: E501
from openapi_server.models.ride_status_enum import RideStatusEnum  # noqa: E501
from openapi_server.models.ride_type_enum_with_other import RideTypeEnumWithOther  # noqa: E501
from openapi_server.models.vehicle_detail import VehicleDetail  # noqa: E501

class RideDetail(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, beacon_color=None, can_cancel=None, canceled_by=None, cancellation_price=None, destination=None, distance_miles=None, driver=None, dropoff=None, duration_seconds=None, feedback=None, generated_at=None, line_items=None, location=None, origin=None, passenger=None, pickup=None, price=None, pricing_details_url=None, primetime_percentage=None, rating=None, requested_at=None, ride_id=None, ride_profile=None, ride_type=None, route_url=None, status=None, vehicle=None):  # noqa: E501
        """RideDetail - a model defined in OpenAPI

        :param beacon_color: The beacon_color of this RideDetail.  # noqa: E501
        :type beacon_color: str
        :param can_cancel: The can_cancel of this RideDetail.  # noqa: E501
        :type can_cancel: List[str]
        :param canceled_by: The canceled_by of this RideDetail.  # noqa: E501
        :type canceled_by: str
        :param cancellation_price: The cancellation_price of this RideDetail.  # noqa: E501
        :type cancellation_price: CancellationCost
        :param destination: The destination of this RideDetail.  # noqa: E501
        :type destination: RideLocation
        :param distance_miles: The distance_miles of this RideDetail.  # noqa: E501
        :type distance_miles: float
        :param driver: The driver of this RideDetail.  # noqa: E501
        :type driver: DriverDetail
        :param dropoff: The dropoff of this RideDetail.  # noqa: E501
        :type dropoff: PickupDropoffLocation
        :param duration_seconds: The duration_seconds of this RideDetail.  # noqa: E501
        :type duration_seconds: int
        :param feedback: The feedback of this RideDetail.  # noqa: E501
        :type feedback: str
        :param generated_at: The generated_at of this RideDetail.  # noqa: E501
        :type generated_at: datetime
        :param line_items: The line_items of this RideDetail.  # noqa: E501
        :type line_items: List[LineItem]
        :param location: The location of this RideDetail.  # noqa: E501
        :type location: CurrentRideLocation
        :param origin: The origin of this RideDetail.  # noqa: E501
        :type origin: RideLocation
        :param passenger: The passenger of this RideDetail.  # noqa: E501
        :type passenger: PassengerDetail
        :param pickup: The pickup of this RideDetail.  # noqa: E501
        :type pickup: PickupDropoffLocation
        :param price: The price of this RideDetail.  # noqa: E501
        :type price: Cost
        :param pricing_details_url: The pricing_details_url of this RideDetail.  # noqa: E501
        :type pricing_details_url: str
        :param primetime_percentage: The primetime_percentage of this RideDetail.  # noqa: E501
        :type primetime_percentage: str
        :param rating: The rating of this RideDetail.  # noqa: E501
        :type rating: int
        :param requested_at: The requested_at of this RideDetail.  # noqa: E501
        :type requested_at: datetime
        :param ride_id: The ride_id of this RideDetail.  # noqa: E501
        :type ride_id: str
        :param ride_profile: The ride_profile of this RideDetail.  # noqa: E501
        :type ride_profile: RideProfileEnum
        :param ride_type: The ride_type of this RideDetail.  # noqa: E501
        :type ride_type: RideTypeEnumWithOther
        :param route_url: The route_url of this RideDetail.  # noqa: E501
        :type route_url: str
        :param status: The status of this RideDetail.  # noqa: E501
        :type status: RideStatusEnum
        :param vehicle: The vehicle of this RideDetail.  # noqa: E501
        :type vehicle: VehicleDetail
        """
        self.openapi_types = {
            'beacon_color': str,
            'can_cancel': List[str],
            'canceled_by': str,
            'cancellation_price': CancellationCost,
            'destination': RideLocation,
            'distance_miles': float,
            'driver': DriverDetail,
            'dropoff': PickupDropoffLocation,
            'duration_seconds': int,
            'feedback': str,
            'generated_at': datetime,
            'line_items': List[LineItem],
            'location': CurrentRideLocation,
            'origin': RideLocation,
            'passenger': PassengerDetail,
            'pickup': PickupDropoffLocation,
            'price': Cost,
            'pricing_details_url': str,
            'primetime_percentage': str,
            'rating': int,
            'requested_at': datetime,
            'ride_id': str,
            'ride_profile': RideProfileEnum,
            'ride_type': RideTypeEnumWithOther,
            'route_url': str,
            'status': RideStatusEnum,
            'vehicle': VehicleDetail
        }

        self.attribute_map = {
            'beacon_color': 'beacon_color',
            'can_cancel': 'can_cancel',
            'canceled_by': 'canceled_by',
            'cancellation_price': 'cancellation_price',
            'destination': 'destination',
            'distance_miles': 'distance_miles',
            'driver': 'driver',
            'dropoff': 'dropoff',
            'duration_seconds': 'duration_seconds',
            'feedback': 'feedback',
            'generated_at': 'generated_at',
            'line_items': 'line_items',
            'location': 'location',
            'origin': 'origin',
            'passenger': 'passenger',
            'pickup': 'pickup',
            'price': 'price',
            'pricing_details_url': 'pricing_details_url',
            'primetime_percentage': 'primetime_percentage',
            'rating': 'rating',
            'requested_at': 'requested_at',
            'ride_id': 'ride_id',
            'ride_profile': 'ride_profile',
            'ride_type': 'ride_type',
            'route_url': 'route_url',
            'status': 'status',
            'vehicle': 'vehicle'
        }

        self._beacon_color = beacon_color
        self._can_cancel = can_cancel
        self._canceled_by = canceled_by
        self._cancellation_price = cancellation_price
        self._destination = destination
        self._distance_miles = distance_miles
        self._driver = driver
        self._dropoff = dropoff
        self._duration_seconds = duration_seconds
        self._feedback = feedback
        self._generated_at = generated_at
        self._line_items = line_items
        self._location = location
        self._origin = origin
        self._passenger = passenger
        self._pickup = pickup
        self._price = price
        self._pricing_details_url = pricing_details_url
        self._primetime_percentage = primetime_percentage
        self._rating = rating
        self._requested_at = requested_at
        self._ride_id = ride_id
        self._ride_profile = ride_profile
        self._ride_type = ride_type
        self._route_url = route_url
        self._status = status
        self._vehicle = vehicle

    @classmethod
    def from_dict(cls, dikt) -> 'RideDetail':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The RideDetail of this RideDetail.  # noqa: E501
        :rtype: RideDetail
        """
        return util.deserialize_model(dikt, cls)

    @property
    def beacon_color(self) -> str:
        """Gets the beacon_color of this RideDetail.

        Hex color code of the driver AMP device.  # noqa: E501

        :return: The beacon_color of this RideDetail.
        :rtype: str
        """
        return self._beacon_color

    @beacon_color.setter
    def beacon_color(self, beacon_color: str):
        """Sets the beacon_color of this RideDetail.

        Hex color code of the driver AMP device.  # noqa: E501

        :param beacon_color: The beacon_color of this RideDetail.
        :type beacon_color: str
        """

        self._beacon_color = beacon_color

    @property
    def can_cancel(self) -> List[str]:
        """Gets the can_cancel of this RideDetail.


        :return: The can_cancel of this RideDetail.
        :rtype: List[str]
        """
        return self._can_cancel

    @can_cancel.setter
    def can_cancel(self, can_cancel: List[str]):
        """Sets the can_cancel of this RideDetail.


        :param can_cancel: The can_cancel of this RideDetail.
        :type can_cancel: List[str]
        """
        allowed_values = ["driver", "passenger", "dispatcher"]  # noqa: E501
        if not set(can_cancel).issubset(set(allowed_values)):
            raise ValueError(
                "Invalid values for `can_cancel` [{0}], must be a subset of [{1}]"  # noqa: E501
                .format(", ".join(map(str, set(can_cancel) - set(allowed_values))),  # noqa: E501
                        ", ".join(map(str, allowed_values)))
            )

        self._can_cancel = can_cancel

    @property
    def canceled_by(self) -> str:
        """Gets the canceled_by of this RideDetail.

        The role of user who canceled the ride (if applicable)  # noqa: E501

        :return: The canceled_by of this RideDetail.
        :rtype: str
        """
        return self._canceled_by

    @canceled_by.setter
    def canceled_by(self, canceled_by: str):
        """Sets the canceled_by of this RideDetail.

        The role of user who canceled the ride (if applicable)  # noqa: E501

        :param canceled_by: The canceled_by of this RideDetail.
        :type canceled_by: str
        """

        self._canceled_by = canceled_by

    @property
    def cancellation_price(self) -> CancellationCost:
        """Gets the cancellation_price of this RideDetail.


        :return: The cancellation_price of this RideDetail.
        :rtype: CancellationCost
        """
        return self._cancellation_price

    @cancellation_price.setter
    def cancellation_price(self, cancellation_price: CancellationCost):
        """Sets the cancellation_price of this RideDetail.


        :param cancellation_price: The cancellation_price of this RideDetail.
        :type cancellation_price: CancellationCost
        """

        self._cancellation_price = cancellation_price

    @property
    def destination(self) -> RideLocation:
        """Gets the destination of this RideDetail.


        :return: The destination of this RideDetail.
        :rtype: RideLocation
        """
        return self._destination

    @destination.setter
    def destination(self, destination: RideLocation):
        """Sets the destination of this RideDetail.


        :param destination: The destination of this RideDetail.
        :type destination: RideLocation
        """

        self._destination = destination

    @property
    def distance_miles(self) -> float:
        """Gets the distance_miles of this RideDetail.

        The distance, in miles, that this ride traveled. This field is only present after drop-off  # noqa: E501

        :return: The distance_miles of this RideDetail.
        :rtype: float
        """
        return self._distance_miles

    @distance_miles.setter
    def distance_miles(self, distance_miles: float):
        """Sets the distance_miles of this RideDetail.

        The distance, in miles, that this ride traveled. This field is only present after drop-off  # noqa: E501

        :param distance_miles: The distance_miles of this RideDetail.
        :type distance_miles: float
        """

        self._distance_miles = distance_miles

    @property
    def driver(self) -> DriverDetail:
        """Gets the driver of this RideDetail.


        :return: The driver of this RideDetail.
        :rtype: DriverDetail
        """
        return self._driver

    @driver.setter
    def driver(self, driver: DriverDetail):
        """Sets the driver of this RideDetail.


        :param driver: The driver of this RideDetail.
        :type driver: DriverDetail
        """

        self._driver = driver

    @property
    def dropoff(self) -> PickupDropoffLocation:
        """Gets the dropoff of this RideDetail.


        :return: The dropoff of this RideDetail.
        :rtype: PickupDropoffLocation
        """
        return self._dropoff

    @dropoff.setter
    def dropoff(self, dropoff: PickupDropoffLocation):
        """Sets the dropoff of this RideDetail.


        :param dropoff: The dropoff of this RideDetail.
        :type dropoff: PickupDropoffLocation
        """

        self._dropoff = dropoff

    @property
    def duration_seconds(self) -> int:
        """Gets the duration_seconds of this RideDetail.

        Duration of the ride in seconds from pickup to drop-off. This field is only present after drop-off.  # noqa: E501

        :return: The duration_seconds of this RideDetail.
        :rtype: int
        """
        return self._duration_seconds

    @duration_seconds.setter
    def duration_seconds(self, duration_seconds: int):
        """Sets the duration_seconds of this RideDetail.

        Duration of the ride in seconds from pickup to drop-off. This field is only present after drop-off.  # noqa: E501

        :param duration_seconds: The duration_seconds of this RideDetail.
        :type duration_seconds: int
        """

        self._duration_seconds = duration_seconds

    @property
    def feedback(self) -> str:
        """Gets the feedback of this RideDetail.

        The written feedback the user left for this ride  # noqa: E501

        :return: The feedback of this RideDetail.
        :rtype: str
        """
        return self._feedback

    @feedback.setter
    def feedback(self, feedback: str):
        """Sets the feedback of this RideDetail.

        The written feedback the user left for this ride  # noqa: E501

        :param feedback: The feedback of this RideDetail.
        :type feedback: str
        """

        self._feedback = feedback

    @property
    def generated_at(self) -> datetime:
        """Gets the generated_at of this RideDetail.

        The request timestamp in date and time  # noqa: E501

        :return: The generated_at of this RideDetail.
        :rtype: datetime
        """
        return self._generated_at

    @generated_at.setter
    def generated_at(self, generated_at: datetime):
        """Sets the generated_at of this RideDetail.

        The request timestamp in date and time  # noqa: E501

        :param generated_at: The generated_at of this RideDetail.
        :type generated_at: datetime
        """

        self._generated_at = generated_at

    @property
    def line_items(self) -> List[LineItem]:
        """Gets the line_items of this RideDetail.

        The break down of cost  # noqa: E501

        :return: The line_items of this RideDetail.
        :rtype: List[LineItem]
        """
        return self._line_items

    @line_items.setter
    def line_items(self, line_items: List[LineItem]):
        """Sets the line_items of this RideDetail.

        The break down of cost  # noqa: E501

        :param line_items: The line_items of this RideDetail.
        :type line_items: List[LineItem]
        """

        self._line_items = line_items

    @property
    def location(self) -> CurrentRideLocation:
        """Gets the location of this RideDetail.


        :return: The location of this RideDetail.
        :rtype: CurrentRideLocation
        """
        return self._location

    @location.setter
    def location(self, location: CurrentRideLocation):
        """Sets the location of this RideDetail.


        :param location: The location of this RideDetail.
        :type location: CurrentRideLocation
        """

        self._location = location

    @property
    def origin(self) -> RideLocation:
        """Gets the origin of this RideDetail.


        :return: The origin of this RideDetail.
        :rtype: RideLocation
        """
        return self._origin

    @origin.setter
    def origin(self, origin: RideLocation):
        """Sets the origin of this RideDetail.


        :param origin: The origin of this RideDetail.
        :type origin: RideLocation
        """

        self._origin = origin

    @property
    def passenger(self) -> PassengerDetail:
        """Gets the passenger of this RideDetail.


        :return: The passenger of this RideDetail.
        :rtype: PassengerDetail
        """
        return self._passenger

    @passenger.setter
    def passenger(self, passenger: PassengerDetail):
        """Sets the passenger of this RideDetail.


        :param passenger: The passenger of this RideDetail.
        :type passenger: PassengerDetail
        """

        self._passenger = passenger

    @property
    def pickup(self) -> PickupDropoffLocation:
        """Gets the pickup of this RideDetail.


        :return: The pickup of this RideDetail.
        :rtype: PickupDropoffLocation
        """
        return self._pickup

    @pickup.setter
    def pickup(self, pickup: PickupDropoffLocation):
        """Sets the pickup of this RideDetail.


        :param pickup: The pickup of this RideDetail.
        :type pickup: PickupDropoffLocation
        """

        self._pickup = pickup

    @property
    def price(self) -> Cost:
        """Gets the price of this RideDetail.


        :return: The price of this RideDetail.
        :rtype: Cost
        """
        return self._price

    @price.setter
    def price(self, price: Cost):
        """Sets the price of this RideDetail.


        :param price: The price of this RideDetail.
        :type price: Cost
        """

        self._price = price

    @property
    def pricing_details_url(self) -> str:
        """Gets the pricing_details_url of this RideDetail.

        The web view showing the pricing structure for the geographic area where the ride was taken   # noqa: E501

        :return: The pricing_details_url of this RideDetail.
        :rtype: str
        """
        return self._pricing_details_url

    @pricing_details_url.setter
    def pricing_details_url(self, pricing_details_url: str):
        """Sets the pricing_details_url of this RideDetail.

        The web view showing the pricing structure for the geographic area where the ride was taken   # noqa: E501

        :param pricing_details_url: The pricing_details_url of this RideDetail.
        :type pricing_details_url: str
        """

        self._pricing_details_url = pricing_details_url

    @property
    def primetime_percentage(self) -> str:
        """Gets the primetime_percentage of this RideDetail.

        The Prime Time percentage applied to the base price  # noqa: E501

        :return: The primetime_percentage of this RideDetail.
        :rtype: str
        """
        return self._primetime_percentage

    @primetime_percentage.setter
    def primetime_percentage(self, primetime_percentage: str):
        """Sets the primetime_percentage of this RideDetail.

        The Prime Time percentage applied to the base price  # noqa: E501

        :param primetime_percentage: The primetime_percentage of this RideDetail.
        :type primetime_percentage: str
        """

        self._primetime_percentage = primetime_percentage

    @property
    def rating(self) -> int:
        """Gets the rating of this RideDetail.

        The rating the user left for this ride, from 1 to 5  # noqa: E501

        :return: The rating of this RideDetail.
        :rtype: int
        """
        return self._rating

    @rating.setter
    def rating(self, rating: int):
        """Sets the rating of this RideDetail.

        The rating the user left for this ride, from 1 to 5  # noqa: E501

        :param rating: The rating of this RideDetail.
        :type rating: int
        """

        self._rating = rating

    @property
    def requested_at(self) -> datetime:
        """Gets the requested_at of this RideDetail.

        The ride requested timestamp in date and time  # noqa: E501

        :return: The requested_at of this RideDetail.
        :rtype: datetime
        """
        return self._requested_at

    @requested_at.setter
    def requested_at(self, requested_at: datetime):
        """Sets the requested_at of this RideDetail.

        The ride requested timestamp in date and time  # noqa: E501

        :param requested_at: The requested_at of this RideDetail.
        :type requested_at: datetime
        """

        self._requested_at = requested_at

    @property
    def ride_id(self) -> str:
        """Gets the ride_id of this RideDetail.

        The unique ID of this ride  # noqa: E501

        :return: The ride_id of this RideDetail.
        :rtype: str
        """
        return self._ride_id

    @ride_id.setter
    def ride_id(self, ride_id: str):
        """Sets the ride_id of this RideDetail.

        The unique ID of this ride  # noqa: E501

        :param ride_id: The ride_id of this RideDetail.
        :type ride_id: str
        """

        self._ride_id = ride_id

    @property
    def ride_profile(self) -> RideProfileEnum:
        """Gets the ride_profile of this RideDetail.


        :return: The ride_profile of this RideDetail.
        :rtype: RideProfileEnum
        """
        return self._ride_profile

    @ride_profile.setter
    def ride_profile(self, ride_profile: RideProfileEnum):
        """Sets the ride_profile of this RideDetail.


        :param ride_profile: The ride_profile of this RideDetail.
        :type ride_profile: RideProfileEnum
        """

        self._ride_profile = ride_profile

    @property
    def ride_type(self) -> RideTypeEnumWithOther:
        """Gets the ride_type of this RideDetail.


        :return: The ride_type of this RideDetail.
        :rtype: RideTypeEnumWithOther
        """
        return self._ride_type

    @ride_type.setter
    def ride_type(self, ride_type: RideTypeEnumWithOther):
        """Sets the ride_type of this RideDetail.


        :param ride_type: The ride_type of this RideDetail.
        :type ride_type: RideTypeEnumWithOther
        """

        self._ride_type = ride_type

    @property
    def route_url(self) -> str:
        """Gets the route_url of this RideDetail.

        The web view showing the passenger, driver, and route for this ride. This field will only be present for rides created through this API, or that have been shared through the \"Share my Route\" feature   # noqa: E501

        :return: The route_url of this RideDetail.
        :rtype: str
        """
        return self._route_url

    @route_url.setter
    def route_url(self, route_url: str):
        """Sets the route_url of this RideDetail.

        The web view showing the passenger, driver, and route for this ride. This field will only be present for rides created through this API, or that have been shared through the \"Share my Route\" feature   # noqa: E501

        :param route_url: The route_url of this RideDetail.
        :type route_url: str
        """

        self._route_url = route_url

    @property
    def status(self) -> RideStatusEnum:
        """Gets the status of this RideDetail.


        :return: The status of this RideDetail.
        :rtype: RideStatusEnum
        """
        return self._status

    @status.setter
    def status(self, status: RideStatusEnum):
        """Sets the status of this RideDetail.


        :param status: The status of this RideDetail.
        :type status: RideStatusEnum
        """

        self._status = status

    @property
    def vehicle(self) -> VehicleDetail:
        """Gets the vehicle of this RideDetail.


        :return: The vehicle of this RideDetail.
        :rtype: VehicleDetail
        """
        return self._vehicle

    @vehicle.setter
    def vehicle(self, vehicle: VehicleDetail):
        """Sets the vehicle of this RideDetail.


        :param vehicle: The vehicle of this RideDetail.
        :type vehicle: VehicleDetail
        """

        self._vehicle = vehicle