from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.dependent_flag_links import DependentFlagLinks
from openapi_server.models.site import Site
from openapi_server import util

from openapi_server.models.dependent_flag_links import DependentFlagLinks  # noqa: E501
from openapi_server.models.site import Site  # noqa: E501

class DependentFlag(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, links=None, site=None, key=None, name=None):  # noqa: E501
        """DependentFlag - a model defined in OpenAPI

        :param links: The links of this DependentFlag.  # noqa: E501
        :type links: DependentFlagLinks
        :param site: The site of this DependentFlag.  # noqa: E501
        :type site: Site
        :param key: The key of this DependentFlag.  # noqa: E501
        :type key: str
        :param name: The name of this DependentFlag.  # noqa: E501
        :type name: str
        """
        self.openapi_types = {
            'links': DependentFlagLinks,
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
    def from_dict(cls, dikt) -> 'DependentFlag':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DependentFlag of this DependentFlag.  # noqa: E501
        :rtype: DependentFlag
        """
        return util.deserialize_model(dikt, cls)

    @property
    def links(self) -> DependentFlagLinks:
        """Gets the links of this DependentFlag.


        :return: The links of this DependentFlag.
        :rtype: DependentFlagLinks
        """
        return self._links

    @links.setter
    def links(self, links: DependentFlagLinks):
        """Sets the links of this DependentFlag.


        :param links: The links of this DependentFlag.
        :type links: DependentFlagLinks
        """

        self._links = links

    @property
    def site(self) -> Site:
        """Gets the site of this DependentFlag.


        :return: The site of this DependentFlag.
        :rtype: Site
        """
        return self._site

    @site.setter
    def site(self, site: Site):
        """Sets the site of this DependentFlag.


        :param site: The site of this DependentFlag.
        :type site: Site
        """

        self._site = site

    @property
    def key(self) -> str:
        """Gets the key of this DependentFlag.


        :return: The key of this DependentFlag.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key: str):
        """Sets the key of this DependentFlag.


        :param key: The key of this DependentFlag.
        :type key: str
        """

        self._key = key

    @property
    def name(self) -> str:
        """Gets the name of this DependentFlag.


        :return: The name of this DependentFlag.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this DependentFlag.


        :param name: The name of this DependentFlag.
        :type name: str
        """

        self._name = name
