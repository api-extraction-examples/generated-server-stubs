from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class NetworkContainer(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, endpoint_id=None, ipv4_address=None, ipv6_address=None, mac_address=None, name=None):  # noqa: E501
        """NetworkContainer - a model defined in OpenAPI

        :param endpoint_id: The endpoint_id of this NetworkContainer.  # noqa: E501
        :type endpoint_id: str
        :param ipv4_address: The ipv4_address of this NetworkContainer.  # noqa: E501
        :type ipv4_address: str
        :param ipv6_address: The ipv6_address of this NetworkContainer.  # noqa: E501
        :type ipv6_address: str
        :param mac_address: The mac_address of this NetworkContainer.  # noqa: E501
        :type mac_address: str
        :param name: The name of this NetworkContainer.  # noqa: E501
        :type name: str
        """
        self.openapi_types = {
            'endpoint_id': str,
            'ipv4_address': str,
            'ipv6_address': str,
            'mac_address': str,
            'name': str
        }

        self.attribute_map = {
            'endpoint_id': 'EndpointID',
            'ipv4_address': 'IPv4Address',
            'ipv6_address': 'IPv6Address',
            'mac_address': 'MacAddress',
            'name': 'Name'
        }

        self._endpoint_id = endpoint_id
        self._ipv4_address = ipv4_address
        self._ipv6_address = ipv6_address
        self._mac_address = mac_address
        self._name = name

    @classmethod
    def from_dict(cls, dikt) -> 'NetworkContainer':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The NetworkContainer of this NetworkContainer.  # noqa: E501
        :rtype: NetworkContainer
        """
        return util.deserialize_model(dikt, cls)

    @property
    def endpoint_id(self) -> str:
        """Gets the endpoint_id of this NetworkContainer.


        :return: The endpoint_id of this NetworkContainer.
        :rtype: str
        """
        return self._endpoint_id

    @endpoint_id.setter
    def endpoint_id(self, endpoint_id: str):
        """Sets the endpoint_id of this NetworkContainer.


        :param endpoint_id: The endpoint_id of this NetworkContainer.
        :type endpoint_id: str
        """

        self._endpoint_id = endpoint_id

    @property
    def ipv4_address(self) -> str:
        """Gets the ipv4_address of this NetworkContainer.


        :return: The ipv4_address of this NetworkContainer.
        :rtype: str
        """
        return self._ipv4_address

    @ipv4_address.setter
    def ipv4_address(self, ipv4_address: str):
        """Sets the ipv4_address of this NetworkContainer.


        :param ipv4_address: The ipv4_address of this NetworkContainer.
        :type ipv4_address: str
        """

        self._ipv4_address = ipv4_address

    @property
    def ipv6_address(self) -> str:
        """Gets the ipv6_address of this NetworkContainer.


        :return: The ipv6_address of this NetworkContainer.
        :rtype: str
        """
        return self._ipv6_address

    @ipv6_address.setter
    def ipv6_address(self, ipv6_address: str):
        """Sets the ipv6_address of this NetworkContainer.


        :param ipv6_address: The ipv6_address of this NetworkContainer.
        :type ipv6_address: str
        """

        self._ipv6_address = ipv6_address

    @property
    def mac_address(self) -> str:
        """Gets the mac_address of this NetworkContainer.


        :return: The mac_address of this NetworkContainer.
        :rtype: str
        """
        return self._mac_address

    @mac_address.setter
    def mac_address(self, mac_address: str):
        """Sets the mac_address of this NetworkContainer.


        :param mac_address: The mac_address of this NetworkContainer.
        :type mac_address: str
        """

        self._mac_address = mac_address

    @property
    def name(self) -> str:
        """Gets the name of this NetworkContainer.


        :return: The name of this NetworkContainer.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this NetworkContainer.


        :param name: The name of this NetworkContainer.
        :type name: str
        """

        self._name = name
