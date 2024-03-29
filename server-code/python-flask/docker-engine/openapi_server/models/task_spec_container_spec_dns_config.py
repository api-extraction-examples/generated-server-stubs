from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class TaskSpecContainerSpecDNSConfig(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, nameservers=None, options=None, search=None):  # noqa: E501
        """TaskSpecContainerSpecDNSConfig - a model defined in OpenAPI

        :param nameservers: The nameservers of this TaskSpecContainerSpecDNSConfig.  # noqa: E501
        :type nameservers: List[str]
        :param options: The options of this TaskSpecContainerSpecDNSConfig.  # noqa: E501
        :type options: List[str]
        :param search: The search of this TaskSpecContainerSpecDNSConfig.  # noqa: E501
        :type search: List[str]
        """
        self.openapi_types = {
            'nameservers': List[str],
            'options': List[str],
            'search': List[str]
        }

        self.attribute_map = {
            'nameservers': 'Nameservers',
            'options': 'Options',
            'search': 'Search'
        }

        self._nameservers = nameservers
        self._options = options
        self._search = search

    @classmethod
    def from_dict(cls, dikt) -> 'TaskSpecContainerSpecDNSConfig':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The TaskSpec_ContainerSpec_DNSConfig of this TaskSpecContainerSpecDNSConfig.  # noqa: E501
        :rtype: TaskSpecContainerSpecDNSConfig
        """
        return util.deserialize_model(dikt, cls)

    @property
    def nameservers(self) -> List[str]:
        """Gets the nameservers of this TaskSpecContainerSpecDNSConfig.

        The IP addresses of the name servers.  # noqa: E501

        :return: The nameservers of this TaskSpecContainerSpecDNSConfig.
        :rtype: List[str]
        """
        return self._nameservers

    @nameservers.setter
    def nameservers(self, nameservers: List[str]):
        """Sets the nameservers of this TaskSpecContainerSpecDNSConfig.

        The IP addresses of the name servers.  # noqa: E501

        :param nameservers: The nameservers of this TaskSpecContainerSpecDNSConfig.
        :type nameservers: List[str]
        """

        self._nameservers = nameservers

    @property
    def options(self) -> List[str]:
        """Gets the options of this TaskSpecContainerSpecDNSConfig.

        A list of internal resolver variables to be modified (e.g., `debug`, `ndots:3`, etc.).  # noqa: E501

        :return: The options of this TaskSpecContainerSpecDNSConfig.
        :rtype: List[str]
        """
        return self._options

    @options.setter
    def options(self, options: List[str]):
        """Sets the options of this TaskSpecContainerSpecDNSConfig.

        A list of internal resolver variables to be modified (e.g., `debug`, `ndots:3`, etc.).  # noqa: E501

        :param options: The options of this TaskSpecContainerSpecDNSConfig.
        :type options: List[str]
        """

        self._options = options

    @property
    def search(self) -> List[str]:
        """Gets the search of this TaskSpecContainerSpecDNSConfig.

        A search list for host-name lookup.  # noqa: E501

        :return: The search of this TaskSpecContainerSpecDNSConfig.
        :rtype: List[str]
        """
        return self._search

    @search.setter
    def search(self, search: List[str]):
        """Sets the search of this TaskSpecContainerSpecDNSConfig.

        A search list for host-name lookup.  # noqa: E501

        :param search: The search of this TaskSpecContainerSpecDNSConfig.
        :type search: List[str]
        """

        self._search = search
