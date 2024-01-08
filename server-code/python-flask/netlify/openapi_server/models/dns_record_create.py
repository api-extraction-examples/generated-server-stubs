from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class DnsRecordCreate(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, flag=None, hostname=None, port=None, priority=None, tag=None, ttl=None, type=None, value=None, weight=None):  # noqa: E501
        """DnsRecordCreate - a model defined in OpenAPI

        :param flag: The flag of this DnsRecordCreate.  # noqa: E501
        :type flag: int
        :param hostname: The hostname of this DnsRecordCreate.  # noqa: E501
        :type hostname: str
        :param port: The port of this DnsRecordCreate.  # noqa: E501
        :type port: int
        :param priority: The priority of this DnsRecordCreate.  # noqa: E501
        :type priority: int
        :param tag: The tag of this DnsRecordCreate.  # noqa: E501
        :type tag: str
        :param ttl: The ttl of this DnsRecordCreate.  # noqa: E501
        :type ttl: int
        :param type: The type of this DnsRecordCreate.  # noqa: E501
        :type type: str
        :param value: The value of this DnsRecordCreate.  # noqa: E501
        :type value: str
        :param weight: The weight of this DnsRecordCreate.  # noqa: E501
        :type weight: int
        """
        self.openapi_types = {
            'flag': int,
            'hostname': str,
            'port': int,
            'priority': int,
            'tag': str,
            'ttl': int,
            'type': str,
            'value': str,
            'weight': int
        }

        self.attribute_map = {
            'flag': 'flag',
            'hostname': 'hostname',
            'port': 'port',
            'priority': 'priority',
            'tag': 'tag',
            'ttl': 'ttl',
            'type': 'type',
            'value': 'value',
            'weight': 'weight'
        }

        self._flag = flag
        self._hostname = hostname
        self._port = port
        self._priority = priority
        self._tag = tag
        self._ttl = ttl
        self._type = type
        self._value = value
        self._weight = weight

    @classmethod
    def from_dict(cls, dikt) -> 'DnsRecordCreate':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The dnsRecordCreate of this DnsRecordCreate.  # noqa: E501
        :rtype: DnsRecordCreate
        """
        return util.deserialize_model(dikt, cls)

    @property
    def flag(self) -> int:
        """Gets the flag of this DnsRecordCreate.


        :return: The flag of this DnsRecordCreate.
        :rtype: int
        """
        return self._flag

    @flag.setter
    def flag(self, flag: int):
        """Sets the flag of this DnsRecordCreate.


        :param flag: The flag of this DnsRecordCreate.
        :type flag: int
        """

        self._flag = flag

    @property
    def hostname(self) -> str:
        """Gets the hostname of this DnsRecordCreate.


        :return: The hostname of this DnsRecordCreate.
        :rtype: str
        """
        return self._hostname

    @hostname.setter
    def hostname(self, hostname: str):
        """Sets the hostname of this DnsRecordCreate.


        :param hostname: The hostname of this DnsRecordCreate.
        :type hostname: str
        """

        self._hostname = hostname

    @property
    def port(self) -> int:
        """Gets the port of this DnsRecordCreate.


        :return: The port of this DnsRecordCreate.
        :rtype: int
        """
        return self._port

    @port.setter
    def port(self, port: int):
        """Sets the port of this DnsRecordCreate.


        :param port: The port of this DnsRecordCreate.
        :type port: int
        """

        self._port = port

    @property
    def priority(self) -> int:
        """Gets the priority of this DnsRecordCreate.


        :return: The priority of this DnsRecordCreate.
        :rtype: int
        """
        return self._priority

    @priority.setter
    def priority(self, priority: int):
        """Sets the priority of this DnsRecordCreate.


        :param priority: The priority of this DnsRecordCreate.
        :type priority: int
        """

        self._priority = priority

    @property
    def tag(self) -> str:
        """Gets the tag of this DnsRecordCreate.


        :return: The tag of this DnsRecordCreate.
        :rtype: str
        """
        return self._tag

    @tag.setter
    def tag(self, tag: str):
        """Sets the tag of this DnsRecordCreate.


        :param tag: The tag of this DnsRecordCreate.
        :type tag: str
        """

        self._tag = tag

    @property
    def ttl(self) -> int:
        """Gets the ttl of this DnsRecordCreate.


        :return: The ttl of this DnsRecordCreate.
        :rtype: int
        """
        return self._ttl

    @ttl.setter
    def ttl(self, ttl: int):
        """Sets the ttl of this DnsRecordCreate.


        :param ttl: The ttl of this DnsRecordCreate.
        :type ttl: int
        """

        self._ttl = ttl

    @property
    def type(self) -> str:
        """Gets the type of this DnsRecordCreate.


        :return: The type of this DnsRecordCreate.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this DnsRecordCreate.


        :param type: The type of this DnsRecordCreate.
        :type type: str
        """

        self._type = type

    @property
    def value(self) -> str:
        """Gets the value of this DnsRecordCreate.


        :return: The value of this DnsRecordCreate.
        :rtype: str
        """
        return self._value

    @value.setter
    def value(self, value: str):
        """Sets the value of this DnsRecordCreate.


        :param value: The value of this DnsRecordCreate.
        :type value: str
        """

        self._value = value

    @property
    def weight(self) -> int:
        """Gets the weight of this DnsRecordCreate.


        :return: The weight of this DnsRecordCreate.
        :rtype: int
        """
        return self._weight

    @weight.setter
    def weight(self, weight: int):
        """Sets the weight of this DnsRecordCreate.


        :param weight: The weight of this DnsRecordCreate.
        :type weight: int
        """

        self._weight = weight
