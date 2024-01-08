from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.dependent_flag_environment_links import DependentFlagEnvironmentLinks
from openapi_server.models.site import Site
from openapi_server import util

from openapi_server.models.dependent_flag_environment_links import DependentFlagEnvironmentLinks  # noqa: E501
from openapi_server.models.site import Site  # noqa: E501

class DependentFlagEnvironment(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, links=None, site=None, key=None, name=None):  # noqa: E501
        """DependentFlagEnvironment - a model defined in OpenAPI

        :param links: The links of this DependentFlagEnvironment.  # noqa: E501
        :type links: DependentFlagEnvironmentLinks
        :param site: The site of this DependentFlagEnvironment.  # noqa: E501
        :type site: Site
        :param key: The key of this DependentFlagEnvironment.  # noqa: E501
        :type key: str
        :param name: The name of this DependentFlagEnvironment.  # noqa: E501
        :type name: str
        """
        self.openapi_types = {
            'links': DependentFlagEnvironmentLinks,
            'site': Site,
            'key': str,
            'name': str
        }

        self.attribute_map = {
            'links': '_links',
            'site': '_site',
            'key': 'key',
            'name': 'name'
        }

        self._links = links
        self._site = site
        self._key = key
        self._name = name

    @classmethod
    def from_dict(cls, dikt) -> 'DependentFlagEnvironment':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DependentFlagEnvironment of this DependentFlagEnvironment.  # noqa: E501
        :rtype: DependentFlagEnvironment
        """
        return util.deserialize_model(dikt, cls)

    @property
    def links(self) -> DependentFlagEnvironmentLinks:
        """Gets the links of this DependentFlagEnvironment.


        :return: The links of this DependentFlagEnvironment.
        :rtype: DependentFlagEnvironmentLinks
        """
        return self._links

    @links.setter
    def links(self, links: DependentFlagEnvironmentLinks):
        """Sets the links of this DependentFlagEnvironment.


        :param links: The links of this DependentFlagEnvironment.
        :type links: DependentFlagEnvironmentLinks
        """

        self._links = links

    @property
    def site(self) -> Site:
        """Gets the site of this DependentFlagEnvironment.


        :return: The site of this DependentFlagEnvironment.
        :rtype: Site
        """
        return self._site

    @site.setter
    def site(self, site: Site):
        """Sets the site of this DependentFlagEnvironment.


        :param site: The site of this DependentFlagEnvironment.
        :type site: Site
        """

        self._site = site

    @property
    def key(self) -> str:
        """Gets the key of this DependentFlagEnvironment.


        :return: The key of this DependentFlagEnvironment.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key: str):
        """Sets the key of this DependentFlagEnvironment.


        :param key: The key of this DependentFlagEnvironment.
        :type key: str
        """

        self._key = key

    @property
    def name(self) -> str:
        """Gets the name of this DependentFlagEnvironment.


        :return: The name of this DependentFlagEnvironment.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this DependentFlagEnvironment.


        :param name: The name of this DependentFlagEnvironment.
        :type name: str
        """

        self._name = name
