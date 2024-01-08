from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class EndpointIPAMConfig(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, ipv4_address=None, ipv6_address=None, link_local_ips=None):  # noqa: E501
        """EndpointIPAMConfig - a model defined in OpenAPI

        :param ipv4_address: The ipv4_address of this EndpointIPAMConfig.  # noqa: E501
        :type ipv4_address: str
        :param ipv6_address: The ipv6_address of this EndpointIPAMConfig.  # noqa: E501
        :type ipv6_address: str
        :param link_local_ips: The link_local_ips of this EndpointIPAMConfig.  # noqa: E501
        :type link_local_ips: List[str]
        """
        self.openapi_types = {
            'ipv4_address': str,
            'ipv6_address': str,
            'link_local_ips': List[str]
        }

        self.attribute_map = {
            'ipv4_address': 'IPv4Address',
            'ipv6_address': 'IPv6Address',
            'link_local_ips': 'LinkLocalIPs'
        }

        self._ipv4_address = ipv4_address
        self._ipv6_address = ipv6_address
        self._link_local_ips = link_local_ips

    @classmethod
    def from_dict(cls, dikt) -> 'EndpointIPAMConfig':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The EndpointIPAMConfig of this EndpointIPAMConfig.  # noqa: E501
        :rtype: EndpointIPAMConfig
        """
        return util.deserialize_model(dikt, cls)

    @property
    def ipv4_address(self) -> str:
        """Gets the ipv4_address of this EndpointIPAMConfig.


        :return: The ipv4_address of this EndpointIPAMConfig.
        :rtype: str
        """
        return self._ipv4_address

    @ipv4_address.setter
    def ipv4_address(self, ipv4_address: str):
        """Sets the ipv4_address of this EndpointIPAMConfig.


        :param ipv4_address: The ipv4_address of this EndpointIPAMConfig.
        :type ipv4_address: str
        """

        self._ipv4_address = ipv4_address

    @property
    def ipv6_address(self) -> str:
        """Gets the ipv6_address of this EndpointIPAMConfig.


        :return: The ipv6_address of this EndpointIPAMConfig.
        :rtype: str
        """
        return self._ipv6_address

    @ipv6_address.setter
    def ipv6_address(self, ipv6_address: str):
        """Sets the ipv6_address of this EndpointIPAMConfig.


        :param ipv6_address: The ipv6_address of this EndpointIPAMConfig.
        :type ipv6_address: str
        """

        self._ipv6_address = ipv6_address

    @property
    def link_local_ips(self) -> List[str]:
        """Gets the link_local_ips of this EndpointIPAMConfig.


        :return: The link_local_ips of this EndpointIPAMConfig.
        :rtype: List[str]
        """
        return self._link_local_ips

    @link_local_ips.setter
    def link_local_ips(self, link_local_ips: List[str]):
        """Sets the link_local_ips of this EndpointIPAMConfig.


        :param link_local_ips: The link_local_ips of this EndpointIPAMConfig.
        :type link_local_ips: List[str]
        """

        self._link_local_ips = link_local_ips
