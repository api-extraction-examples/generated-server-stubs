from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.dependent_flag_environment import DependentFlagEnvironment
from openapi_server.models.dependent_flags_links import DependentFlagsLinks
from openapi_server.models.site import Site
from openapi_server import util

from openapi_server.models.dependent_flag_environment import DependentFlagEnvironment  # noqa: E501
from openapi_server.models.dependent_flags_links import DependentFlagsLinks  # noqa: E501
from openapi_server.models.site import Site  # noqa: E501

class MultiEnvironmentDependentFlag(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, links=None, site=None, environments=None, key=None, name=None):  # noqa: E501
        """MultiEnvironmentDependentFlag - a model defined in OpenAPI

        :param links: The links of this MultiEnvironmentDependentFlag.  # noqa: E501
        :type links: DependentFlagsLinks
        :param site: The site of this MultiEnvironmentDependentFlag.  # noqa: E501
        :type site: Site
        :param environments: The environments of this MultiEnvironmentDependentFlag.  # noqa: E501
        :type environments: List[DependentFlagEnvironment]
        :param key: The key of this MultiEnvironmentDependentFlag.  # noqa: E501
        :type key: str
        :param name: The name of this MultiEnvironmentDependentFlag.  # noqa: E501
        :type name: str
        """
        self.openapi_types = {
            'links': DependentFlagsLinks,
            'site': Site,
            'environments': List[DependentFlagEnvironment],
            'key': str,
            'name': str
        }

        self.attribute_map = {
            'links': '_links',
            'site': '_site',
            'environments': 'environments',
            'key': 'key',
            'name': 'name'
        }

        self._links = links
        self._site = site
        self._environments = environments
        self._key = key
        self._name = name

    @classmethod
    def from_dict(cls, dikt) -> 'MultiEnvironmentDependentFlag':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The MultiEnvironmentDependentFlag of this MultiEnvironmentDependentFlag.  # noqa: E501
        :rtype: MultiEnvironmentDependentFlag
        """
        return util.deserialize_model(dikt, cls)

    @property
    def links(self) -> DependentFlagsLinks:
        """Gets the links of this MultiEnvironmentDependentFlag.


        :return: The links of this MultiEnvironmentDependentFlag.
        :rtype: DependentFlagsLinks
        """
        return self._links

    @links.setter
    def links(self, links: DependentFlagsLinks):
        """Sets the links of this MultiEnvironmentDependentFlag.


        :param links: The links of this MultiEnvironmentDependentFlag.
        :type links: DependentFlagsLinks
        """

        self._links = links

    @property
    def site(self) -> Site:
        """Gets the site of this MultiEnvironmentDependentFlag.


        :return: The site of this MultiEnvironmentDependentFlag.
        :rtype: Site
        """
        return self._site

    @site.setter
    def site(self, site: Site):
        """Sets the site of this MultiEnvironmentDependentFlag.


        :param site: The site of this MultiEnvironmentDependentFlag.
        :type site: Site
        """

        self._site = site

    @property
    def environments(self) -> List[DependentFlagEnvironment]:
        """Gets the environments of this MultiEnvironmentDependentFlag.


        :return: The environments of this MultiEnvironmentDependentFlag.
        :rtype: List[DependentFlagEnvironment]
        """
        return self._environments

    @environments.setter
    def environments(self, environments: List[DependentFlagEnvironment]):
        """Sets the environments of this MultiEnvironmentDependentFlag.


        :param environments: The environments of this MultiEnvironmentDependentFlag.
        :type environments: List[DependentFlagEnvironment]
        """

        self._environments = environments

    @property
    def key(self) -> str:
        """Gets the key of this MultiEnvironmentDependentFlag.


        :return: The key of this MultiEnvironmentDependentFlag.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key: str):
        """Sets the key of this MultiEnvironmentDependentFlag.


        :param key: The key of this MultiEnvironmentDependentFlag.
        :type key: str
        """

        self._key = key

    @property
    def name(self) -> str:
        """Gets the name of this MultiEnvironmentDependentFlag.


        :return: The name of this MultiEnvironmentDependentFlag.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this MultiEnvironmentDependentFlag.


        :param name: The name of this MultiEnvironmentDependentFlag.
        :type name: str
        """

        self._name = name
