from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.ipam import IPAM
from openapi_server.models.network_container import NetworkContainer
from openapi_server import util

from openapi_server.models.ipam import IPAM  # noqa: E501
from openapi_server.models.network_container import NetworkContainer  # noqa: E501

class Network(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, attachable=None, containers=None, created=None, driver=None, enable_ipv6=None, ipam=None, id=None, ingress=None, internal=None, labels=None, name=None, options=None, scope=None):  # noqa: E501
        """Network - a model defined in OpenAPI

        :param attachable: The attachable of this Network.  # noqa: E501
        :type attachable: bool
        :param containers: The containers of this Network.  # noqa: E501
        :type containers: Dict[str, NetworkContainer]
        :param created: The created of this Network.  # noqa: E501
        :type created: str
        :param driver: The driver of this Network.  # noqa: E501
        :type driver: str
        :param enable_ipv6: The enable_ipv6 of this Network.  # noqa: E501
        :type enable_ipv6: bool
        :param ipam: The ipam of this Network.  # noqa: E501
        :type ipam: IPAM
        :param id: The id of this Network.  # noqa: E501
        :type id: str
        :param ingress: The ingress of this Network.  # noqa: E501
        :type ingress: bool
        :param internal: The internal of this Network.  # noqa: E501
        :type internal: bool
        :param labels: The labels of this Network.  # noqa: E501
        :type labels: Dict[str, str]
        :param name: The name of this Network.  # noqa: E501
        :type name: str
        :param options: The options of this Network.  # noqa: E501
        :type options: Dict[str, str]
        :param scope: The scope of this Network.  # noqa: E501
        :type scope: str
        """
        self.openapi_types = {
            'attachable': bool,
            'containers': Dict[str, NetworkContainer],
            'created': str,
            'driver': str,
            'enable_ipv6': bool,
            'ipam': IPAM,
            'id': str,
            'ingress': bool,
            'internal': bool,
            'labels': Dict[str, str],
            'name': str,
            'options': Dict[str, str],
            'scope': str
        }

        self.attribute_map = {
            'attachable': 'Attachable',
            'containers': 'Containers',
            'created': 'Created',
            'driver': 'Driver',
            'enable_ipv6': 'EnableIPv6',
            'ipam': 'IPAM',
            'id': 'Id',
            'ingress': 'Ingress',
            'internal': 'Internal',
            'labels': 'Labels',
            'name': 'Name',
            'options': 'Options',
            'scope': 'Scope'
        }

        self._attachable = attachable
        self._containers = containers
        self._created = created
        self._driver = driver
        self._enable_ipv6 = enable_ipv6
        self._ipam = ipam
        self._id = id
        self._ingress = ingress
        self._internal = internal
        self._labels = labels
        self._name = name
        self._options = options
        self._scope = scope

    @classmethod
    def from_dict(cls, dikt) -> 'Network':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Network of this Network.  # noqa: E501
        :rtype: Network
        """
        return util.deserialize_model(dikt, cls)

    @property
    def attachable(self) -> bool:
        """Gets the attachable of this Network.


        :return: The attachable of this Network.
        :rtype: bool
        """
        return self._attachable

    @attachable.setter
    def attachable(self, attachable: bool):
        """Sets the attachable of this Network.


        :param attachable: The attachable of this Network.
        :type attachable: bool
        """

        self._attachable = attachable

    @property
    def containers(self) -> Dict[str, NetworkContainer]:
        """Gets the containers of this Network.


        :return: The containers of this Network.
        :rtype: Dict[str, NetworkContainer]
        """
        return self._containers

    @containers.setter
    def containers(self, containers: Dict[str, NetworkContainer]):
        """Sets the containers of this Network.


        :param containers: The containers of this Network.
        :type containers: Dict[str, NetworkContainer]
        """

        self._containers = containers

    @property
    def created(self) -> str:
        """Gets the created of this Network.


        :return: The created of this Network.
        :rtype: str
        """
        return self._created

    @created.setter
    def created(self, created: str):
        """Sets the created of this Network.


        :param created: The created of this Network.
        :type created: str
        """

        self._created = created

    @property
    def driver(self) -> str:
        """Gets the driver of this Network.


        :return: The driver of this Network.
        :rtype: str
        """
        return self._driver

    @driver.setter
    def driver(self, driver: str):
        """Sets the driver of this Network.


        :param driver: The driver of this Network.
        :type driver: str
        """

        self._driver = driver

    @property
    def enable_ipv6(self) -> bool:
        """Gets the enable_ipv6 of this Network.


        :return: The enable_ipv6 of this Network.
        :rtype: bool
        """
        return self._enable_ipv6

    @enable_ipv6.setter
    def enable_ipv6(self, enable_ipv6: bool):
        """Sets the enable_ipv6 of this Network.


        :param enable_ipv6: The enable_ipv6 of this Network.
        :type enable_ipv6: bool
        """

        self._enable_ipv6 = enable_ipv6

    @property
    def ipam(self) -> IPAM:
        """Gets the ipam of this Network.


        :return: The ipam of this Network.
        :rtype: IPAM
        """
        return self._ipam

    @ipam.setter
    def ipam(self, ipam: IPAM):
        """Sets the ipam of this Network.


        :param ipam: The ipam of this Network.
        :type ipam: IPAM
        """

        self._ipam = ipam

    @property
    def id(self) -> str:
        """Gets the id of this Network.


        :return: The id of this Network.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this Network.


        :param id: The id of this Network.
        :type id: str
        """

        self._id = id

    @property
    def ingress(self) -> bool:
        """Gets the ingress of this Network.


        :return: The ingress of this Network.
        :rtype: bool
        """
        return self._ingress

    @ingress.setter
    def ingress(self, ingress: bool):
        """Sets the ingress of this Network.


        :param ingress: The ingress of this Network.
        :type ingress: bool
        """

        self._ingress = ingress

    @property
    def internal(self) -> bool:
        """Gets the internal of this Network.


        :return: The internal of this Network.
        :rtype: bool
        """
        return self._internal

    @internal.setter
    def internal(self, internal: bool):
        """Sets the internal of this Network.


        :param internal: The internal of this Network.
        :type internal: bool
        """

        self._internal = internal

    @property
    def labels(self) -> Dict[str, str]:
        """Gets the labels of this Network.


        :return: The labels of this Network.
        :rtype: Dict[str, str]
        """
        return self._labels

    @labels.setter
    def labels(self, labels: Dict[str, str]):
        """Sets the labels of this Network.


        :param labels: The labels of this Network.
        :type labels: Dict[str, str]
        """

        self._labels = labels

    @property
    def name(self) -> str:
        """Gets the name of this Network.


        :return: The name of this Network.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this Network.


        :param name: The name of this Network.
        :type name: str
        """

        self._name = name

    @property
    def options(self) -> Dict[str, str]:
        """Gets the options of this Network.


        :return: The options of this Network.
        :rtype: Dict[str, str]
        """
        return self._options

    @options.setter
    def options(self, options: Dict[str, str]):
        """Sets the options of this Network.


        :param options: The options of this Network.
        :type options: Dict[str, str]
        """

        self._options = options

    @property
    def scope(self) -> str:
        """Gets the scope of this Network.


        :return: The scope of this Network.
        :rtype: str
        """
        return self._scope

    @scope.setter
    def scope(self, scope: str):
        """Sets the scope of this Network.


        :param scope: The scope of this Network.
        :type scope: str
        """

        self._scope = scope
