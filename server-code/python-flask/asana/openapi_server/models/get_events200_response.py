from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.event_response import EventResponse
from openapi_server import util

from openapi_server.models.event_response import EventResponse  # noqa: E501

class GetEvents200Response(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None, has_more=None, sync=None):  # noqa: E501
        """GetEvents200Response - a model defined in OpenAPI

        :param data: The data of this GetEvents200Response.  # noqa: E501
        :type data: List[EventResponse]
        :param has_more: The has_more of this GetEvents200Response.  # noqa: E501
        :type has_more: bool
        :param sync: The sync of this GetEvents200Response.  # noqa: E501
        :type sync: str
        """
        self.openapi_types = {
            'data': List[EventResponse],
            'has_more': bool,
            'sync': str
        }

        self.attribute_map = {
            'data': 'data',
            'has_more': 'has_more',
            'sync': 'sync'
        }

        self._data = data
        self._has_more = has_more
        self._sync = sync

    @classmethod
    def from_dict(cls, dikt) -> 'GetEvents200Response':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The getEvents_200_response of this GetEvents200Response.  # noqa: E501
        :rtype: GetEvents200Response
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> List[EventResponse]:
        """Gets the data of this GetEvents200Response.


        :return: The data of this GetEvents200Response.
        :rtype: List[EventResponse]
        """
        return self._data

    @data.setter
    def data(self, data: List[EventResponse]):
        """Sets the data of this GetEvents200Response.


        :param data: The data of this GetEvents200Response.
        :type data: List[EventResponse]
        """

        self._data = data

    @property
    def has_more(self) -> bool:
        """Gets the has_more of this GetEvents200Response.

        Indicates whether there are more events to pull.  # noqa: E501

        :return: The has_more of this GetEvents200Response.
        :rtype: bool
        """
        return self._has_more

    @has_more.setter
    def has_more(self, has_more: bool):
        """Sets the has_more of this GetEvents200Response.

        Indicates whether there are more events to pull.  # noqa: E501

        :param has_more: The has_more of this GetEvents200Response.
        :type has_more: bool
        """

        self._has_more = has_more

    @property
    def sync(self) -> str:
        """Gets the sync of this GetEvents200Response.

        A sync token to be used with the next call to the /events endpoint.  # noqa: E501

        :return: The sync of this GetEvents200Response.
        :rtype: str
        """
        return self._sync

    @sync.setter
    def sync(self, sync: str):
        """Sets the sync of this GetEvents200Response.

        A sync token to be used with the next call to the /events endpoint.  # noqa: E501

        :param sync: The sync of this GetEvents200Response.
        :type sync: str
        """

        self._sync = sync
