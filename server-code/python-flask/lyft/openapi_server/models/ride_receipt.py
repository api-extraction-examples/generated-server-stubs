from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.charge import Charge
from openapi_server.models.cost import Cost
from openapi_server.models.line_item import LineItem
from openapi_server.models.ride_profile_enum import RideProfileEnum
from openapi_server import util

from openapi_server.models.charge import Charge  # noqa: E501
from openapi_server.models.cost import Cost  # noqa: E501
from openapi_server.models.line_item import LineItem  # noqa: E501
from openapi_server.models.ride_profile_enum import RideProfileEnum  # noqa: E501

class RideReceipt(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, charges=None, line_items=None, price=None, requested_at=None, ride_id=None, ride_profile=None):  # noqa: E501
        """RideReceipt - a model defined in OpenAPI

        :param charges: The charges of this RideReceipt.  # noqa: E501
        :type charges: List[Charge]
        :param line_items: The line_items of this RideReceipt.  # noqa: E501
        :type line_items: List[LineItem]
        :param price: The price of this RideReceipt.  # noqa: E501
        :type price: Cost
        :param requested_at: The requested_at of this RideReceipt.  # noqa: E501
        :type requested_at: datetime
        :param ride_id: The ride_id of this RideReceipt.  # noqa: E501
        :type ride_id: str
        :param ride_profile: The ride_profile of this RideReceipt.  # noqa: E501
        :type ride_profile: RideProfileEnum
        """
        self.openapi_types = {
            'charges': List[Charge],
            'line_items': List[LineItem],
            'price': Cost,
            'requested_at': datetime,
            'ride_id': str,
            'ride_profile': RideProfileEnum
        }

        self.attribute_map = {
            'charges': 'charges',
            'line_items': 'line_items',
            'price': 'price',
            'requested_at': 'requested_at',
            'ride_id': 'ride_id',
            'ride_profile': 'ride_profile'
        }

        self._charges = charges
        self._line_items = line_items
        self._price = price
        self._requested_at = requested_at
        self._ride_id = ride_id
        self._ride_profile = ride_profile

    @classmethod
    def from_dict(cls, dikt) -> 'RideReceipt':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The RideReceipt of this RideReceipt.  # noqa: E501
        :rtype: RideReceipt
        """
        return util.deserialize_model(dikt, cls)

    @property
    def charges(self) -> List[Charge]:
        """Gets the charges of this RideReceipt.

        The break down of charge method  # noqa: E501

        :return: The charges of this RideReceipt.
        :rtype: List[Charge]
        """
        return self._charges

    @charges.setter
    def charges(self, charges: List[Charge]):
        """Sets the charges of this RideReceipt.

        The break down of charge method  # noqa: E501

        :param charges: The charges of this RideReceipt.
        :type charges: List[Charge]
        """

        self._charges = charges

    @property
    def line_items(self) -> List[LineItem]:
        """Gets the line_items of this RideReceipt.

        The break down of line items  # noqa: E501

        :return: The line_items of this RideReceipt.
        :rtype: List[LineItem]
        """
        return self._line_items

    @line_items.setter
    def line_items(self, line_items: List[LineItem]):
        """Sets the line_items of this RideReceipt.

        The break down of line items  # noqa: E501

        :param line_items: The line_items of this RideReceipt.
        :type line_items: List[LineItem]
        """

        self._line_items = line_items

    @property
    def price(self) -> Cost:
        """Gets the price of this RideReceipt.


        :return: The price of this RideReceipt.
        :rtype: Cost
        """
        return self._price

    @price.setter
    def price(self, price: Cost):
        """Sets the price of this RideReceipt.


        :param price: The price of this RideReceipt.
        :type price: Cost
        """

        self._price = price

    @property
    def requested_at(self) -> datetime:
        """Gets the requested_at of this RideReceipt.

        The ride requested timestamp in date and time  # noqa: E501

        :return: The requested_at of this RideReceipt.
        :rtype: datetime
        """
        return self._requested_at

    @requested_at.setter
    def requested_at(self, requested_at: datetime):
        """Sets the requested_at of this RideReceipt.

        The ride requested timestamp in date and time  # noqa: E501

        :param requested_at: The requested_at of this RideReceipt.
        :type requested_at: datetime
        """

        self._requested_at = requested_at

    @property
    def ride_id(self) -> str:
        """Gets the ride_id of this RideReceipt.

        The unique ID of this ride  # noqa: E501

        :return: The ride_id of this RideReceipt.
        :rtype: str
        """
        return self._ride_id

    @ride_id.setter
    def ride_id(self, ride_id: str):
        """Sets the ride_id of this RideReceipt.

        The unique ID of this ride  # noqa: E501

        :param ride_id: The ride_id of this RideReceipt.
        :type ride_id: str
        """

        self._ride_id = ride_id

    @property
    def ride_profile(self) -> RideProfileEnum:
        """Gets the ride_profile of this RideReceipt.


        :return: The ride_profile of this RideReceipt.
        :rtype: RideProfileEnum
        """
        return self._ride_profile

    @ride_profile.setter
    def ride_profile(self, ride_profile: RideProfileEnum):
        """Sets the ride_profile of this RideReceipt.


        :param ride_profile: The ride_profile of this RideReceipt.
        :type ride_profile: RideProfileEnum
        """

        self._ride_profile = ride_profile
