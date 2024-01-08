from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class DnsRecord(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, dns_zone_id=None, flag=None, hostname=None, id=None, managed=None, priority=None, site_id=None, tag=None, ttl=None, type=None, value=None):  # noqa: E501
        """DnsRecord - a model defined in OpenAPI

        :param dns_zone_id: The dns_zone_id of this DnsRecord.  # noqa: E501
        :type dns_zone_id: str
        :param flag: The flag of this DnsRecord.  # noqa: E501
        :type flag: int
        :param hostname: The hostname of this DnsRecord.  # noqa: E501
        :type hostname: str
        :param id: The id of this DnsRecord.  # noqa: E501
        :type id: str
        :param managed: The managed of this DnsRecord.  # noqa: E501
        :type managed: bool
        :param priority: The priority of this DnsRecord.  # noqa: E501
        :type priority: int
        :param site_id: The site_id of this DnsRecord.  # noqa: E501
        :type site_id: str
        :param tag: The tag of this DnsRecord.  # noqa: E501
        :type tag: str
        :param ttl: The ttl of this DnsRecord.  # noqa: E501
        :type ttl: int
        :param type: The type of this DnsRecord.  # noqa: E501
        :type type: str
        :param value: The value of this DnsRecord.  # noqa: E501
        :type value: str
        """
        self.openapi_types = {
            'dns_zone_id': str,
            'flag': int,
            'hostname': str,
            'id': str,
            'managed': bool,
            'priority': int,
            'site_id': str,
            'tag': str,
            'ttl': int,
            'type': str,
            'value': str
        }

        self.attribute_map = {
            'dns_zone_id': 'dns_zone_id',
            'flag': 'flag',
            'hostname': 'hostname',
            'id': 'id',
            'managed': 'managed',
            'priority': 'priority',
            'site_id': 'site_id',
            'tag': 'tag',
            'ttl': 'ttl',
            'type': 'type',
            'value': 'value'
        }

        self._dns_zone_id = dns_zone_id
        self._flag = flag
        self._hostname = hostname
        self._id = id
        self._managed = managed
        self._priority = priority
        self._site_id = site_id
        self._tag = tag
        self._ttl = ttl
        self._type = type
        self._value = value

    @classmethod
    def from_dict(cls, dikt) -> 'DnsRecord':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The dnsRecord of this DnsRecord.  # noqa: E501
        :rtype: DnsRecord
        """
        return util.deserialize_model(dikt, cls)

    @property
    def dns_zone_id(self) -> str:
        """Gets the dns_zone_id of this DnsRecord.


        :return: The dns_zone_id of this DnsRecord.
        :rtype: str
        """
        return self._dns_zone_id

    @dns_zone_id.setter
    def dns_zone_id(self, dns_zone_id: str):
        """Sets the dns_zone_id of this DnsRecord.


        :param dns_zone_id: The dns_zone_id of this DnsRecord.
        :type dns_zone_id: str
        """

        self._dns_zone_id = dns_zone_id

    @property
    def flag(self) -> int:
        """Gets the flag of this DnsRecord.


        :return: The flag of this DnsRecord.
        :rtype: int
        """
        return self._flag

    @flag.setter
    def flag(self, flag: int):
        """Sets the flag of this DnsRecord.


        :param flag: The flag of this DnsRecord.
        :type flag: int
        """

        self._flag = flag

    @property
    def hostname(self) -> str:
        """Gets the hostname of this DnsRecord.


        :return: The hostname of this DnsRecord.
        :rtype: str
        """
        return self._hostname

    @hostname.setter
    def hostname(self, hostname: str):
        """Sets the hostname of this DnsRecord.


        :param hostname: The hostname of this DnsRecord.
        :type hostname: str
        """

        self._hostname = hostname

    @property
    def id(self) -> str:
        """Gets the id of this DnsRecord.


        :return: The id of this DnsRecord.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this DnsRecord.


        :param id: The id of this DnsRecord.
        :type id: str
        """

        self._id = id

    @property
    def managed(self) -> bool:
        """Gets the managed of this DnsRecord.


        :return: The managed of this DnsRecord.
        :rtype: bool
        """
        return self._managed

    @managed.setter
    def managed(self, managed: bool):
        """Sets the managed of this DnsRecord.


        :param managed: The managed of this DnsRecord.
        :type managed: bool
        """

        self._managed = managed

    @property
    def priority(self) -> int:
        """Gets the priority of this DnsRecord.


        :return: The priority of this DnsRecord.
        :rtype: int
        """
        return self._priority

    @priority.setter
    def priority(self, priority: int):
        """Sets the priority of this DnsRecord.


        :param priority: The priority of this DnsRecord.
        :type priority: int
        """

        self._priority = priority

    @property
    def site_id(self) -> str:
        """Gets the site_id of this DnsRecord.


        :return: The site_id of this DnsRecord.
        :rtype: str
        """
        return self._site_id

    @site_id.setter
    def site_id(self, site_id: str):
        """Sets the site_id of this DnsRecord.


        :param site_id: The site_id of this DnsRecord.
        :type site_id: str
        """

        self._site_id = site_id

    @property
    def tag(self) -> str:
        """Gets the tag of this DnsRecord.


        :return: The tag of this DnsRecord.
        :rtype: str
        """
        return self._tag

    @tag.setter
    def tag(self, tag: str):
        """Sets the tag of this DnsRecord.


        :param tag: The tag of this DnsRecord.
        :type tag: str
        """

        self._tag = tag

    @property
    def ttl(self) -> int:
        """Gets the ttl of this DnsRecord.


        :return: The ttl of this DnsRecord.
        :rtype: int
        """
        return self._ttl

    @ttl.setter
    def ttl(self, ttl: int):
        """Sets the ttl of this DnsRecord.


        :param ttl: The ttl of this DnsRecord.
        :type ttl: int
        """

        self._ttl = ttl

    @property
    def type(self) -> str:
        """Gets the type of this DnsRecord.


        :return: The type of this DnsRecord.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this DnsRecord.


        :param type: The type of this DnsRecord.
        :type type: str
        """

        self._type = type

    @property
    def value(self) -> str:
        """Gets the value of this DnsRecord.


        :return: The value of this DnsRecord.
        :rtype: str
        """
        return self._value

    @value.setter
    def value(self, value: str):
        """Sets the value of this DnsRecord.


        :param value: The value of this DnsRecord.
        :type value: str
        """

        self._value = value
