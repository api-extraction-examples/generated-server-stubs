from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.engine_description import EngineDescription
from openapi_server.models.platform import Platform
from openapi_server.models.resource_object import ResourceObject
from openapi_server.models.tls_info import TLSInfo
from openapi_server import util

from openapi_server.models.engine_description import EngineDescription  # noqa: E501
from openapi_server.models.platform import Platform  # noqa: E501
from openapi_server.models.resource_object import ResourceObject  # noqa: E501
from openapi_server.models.tls_info import TLSInfo  # noqa: E501

class NodeDescription(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, engine=None, hostname=None, platform=None, resources=None, tls_info=None):  # noqa: E501
        """NodeDescription - a model defined in OpenAPI

        :param engine: The engine of this NodeDescription.  # noqa: E501
        :type engine: EngineDescription
        :param hostname: The hostname of this NodeDescription.  # noqa: E501
        :type hostname: str
        :param platform: The platform of this NodeDescription.  # noqa: E501
        :type platform: Platform
        :param resources: The resources of this NodeDescription.  # noqa: E501
        :type resources: ResourceObject
        :param tls_info: The tls_info of this NodeDescription.  # noqa: E501
        :type tls_info: TLSInfo
        """
        self.openapi_types = {
            'engine': EngineDescription,
            'hostname': str,
            'platform': Platform,
            'resources': ResourceObject,
            'tls_info': TLSInfo
        }

        self.attribute_map = {
            'engine': 'Engine',
            'hostname': 'Hostname',
            'platform': 'Platform',
            'resources': 'Resources',
            'tls_info': 'TLSInfo'
        }

        self._engine = engine
        self._hostname = hostname
        self._platform = platform
        self._resources = resources
        self._tls_info = tls_info

    @classmethod
    def from_dict(cls, dikt) -> 'NodeDescription':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The NodeDescription of this NodeDescription.  # noqa: E501
        :rtype: NodeDescription
        """
        return util.deserialize_model(dikt, cls)

    @property
    def engine(self) -> EngineDescription:
        """Gets the engine of this NodeDescription.


        :return: The engine of this NodeDescription.
        :rtype: EngineDescription
        """
        return self._engine

    @engine.setter
    def engine(self, engine: EngineDescription):
        """Sets the engine of this NodeDescription.


        :param engine: The engine of this NodeDescription.
        :type engine: EngineDescription
        """

        self._engine = engine

    @property
    def hostname(self) -> str:
        """Gets the hostname of this NodeDescription.


        :return: The hostname of this NodeDescription.
        :rtype: str
        """
        return self._hostname

    @hostname.setter
    def hostname(self, hostname: str):
        """Sets the hostname of this NodeDescription.


        :param hostname: The hostname of this NodeDescription.
        :type hostname: str
        """

        self._hostname = hostname

    @property
    def platform(self) -> Platform:
        """Gets the platform of this NodeDescription.


        :return: The platform of this NodeDescription.
        :rtype: Platform
        """
        return self._platform

    @platform.setter
    def platform(self, platform: Platform):
        """Sets the platform of this NodeDescription.


        :param platform: The platform of this NodeDescription.
        :type platform: Platform
        """

        self._platform = platform

    @property
    def resources(self) -> ResourceObject:
        """Gets the resources of this NodeDescription.


        :return: The resources of this NodeDescription.
        :rtype: ResourceObject
        """
        return self._resources

    @resources.setter
    def resources(self, resources: ResourceObject):
        """Sets the resources of this NodeDescription.


        :param resources: The resources of this NodeDescription.
        :type resources: ResourceObject
        """

        self._resources = resources

    @property
    def tls_info(self) -> TLSInfo:
        """Gets the tls_info of this NodeDescription.


        :return: The tls_info of this NodeDescription.
        :rtype: TLSInfo
        """
        return self._tls_info

    @tls_info.setter
    def tls_info(self, tls_info: TLSInfo):
        """Sets the tls_info of this NodeDescription.


        :param tls_info: The tls_info of this NodeDescription.
        :type tls_info: TLSInfo
        """

        self._tls_info = tls_info
