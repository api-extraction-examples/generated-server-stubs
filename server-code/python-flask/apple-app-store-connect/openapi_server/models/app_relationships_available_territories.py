from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_relationships_app_infos_links import AppRelationshipsAppInfosLinks
from openapi_server.models.app_relationships_available_territories_data_inner import AppRelationshipsAvailableTerritoriesDataInner
from openapi_server.models.paging_information import PagingInformation
from openapi_server import util

from openapi_server.models.app_relationships_app_infos_links import AppRelationshipsAppInfosLinks  # noqa: E501
from openapi_server.models.app_relationships_available_territories_data_inner import AppRelationshipsAvailableTerritoriesDataInner  # noqa: E501
from openapi_server.models.paging_information import PagingInformation  # noqa: E501

class AppRelationshipsAvailableTerritories(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None, links=None, meta=None):  # noqa: E501
        """AppRelationshipsAvailableTerritories - a model defined in OpenAPI

        :param data: The data of this AppRelationshipsAvailableTerritories.  # noqa: E501
        :type data: List[AppRelationshipsAvailableTerritoriesDataInner]
        :param links: The links of this AppRelationshipsAvailableTerritories.  # noqa: E501
        :type links: AppRelationshipsAppInfosLinks
        :param meta: The meta of this AppRelationshipsAvailableTerritories.  # noqa: E501
        :type meta: PagingInformation
        """
        self.openapi_types = {
            'data': List[AppRelationshipsAvailableTerritoriesDataInner],
            'links': AppRelationshipsAppInfosLinks,
            'meta': PagingInformation
        }

        self.attribute_map = {
            'data': 'data',
            'links': 'links',
            'meta': 'meta'
        }

        self._data = data
        self._links = links
        self._meta = meta

    @classmethod
    def from_dict(cls, dikt) -> 'AppRelationshipsAvailableTerritories':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The App_relationships_availableTerritories of this AppRelationshipsAvailableTerritories.  # noqa: E501
        :rtype: AppRelationshipsAvailableTerritories
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> List[AppRelationshipsAvailableTerritoriesDataInner]:
        """Gets the data of this AppRelationshipsAvailableTerritories.


        :return: The data of this AppRelationshipsAvailableTerritories.
        :rtype: List[AppRelationshipsAvailableTerritoriesDataInner]
        """
        return self._data

    @data.setter
    def data(self, data: List[AppRelationshipsAvailableTerritoriesDataInner]):
        """Sets the data of this AppRelationshipsAvailableTerritories.


        :param data: The data of this AppRelationshipsAvailableTerritories.
        :type data: List[AppRelationshipsAvailableTerritoriesDataInner]
        """

        self._data = data

    @property
    def links(self) -> AppRelationshipsAppInfosLinks:
        """Gets the links of this AppRelationshipsAvailableTerritories.


        :return: The links of this AppRelationshipsAvailableTerritories.
        :rtype: AppRelationshipsAppInfosLinks
        """
        return self._links

    @links.setter
    def links(self, links: AppRelationshipsAppInfosLinks):
        """Sets the links of this AppRelationshipsAvailableTerritories.


        :param links: The links of this AppRelationshipsAvailableTerritories.
        :type links: AppRelationshipsAppInfosLinks
        """

        self._links = links

    @property
    def meta(self) -> PagingInformation:
        """Gets the meta of this AppRelationshipsAvailableTerritories.


        :return: The meta of this AppRelationshipsAvailableTerritories.
        :rtype: PagingInformation
        """
        return self._meta

    @meta.setter
    def meta(self, meta: PagingInformation):
        """Sets the meta of this AppRelationshipsAvailableTerritories.


        :param meta: The meta of this AppRelationshipsAvailableTerritories.
        :type meta: PagingInformation
        """

        self._meta = meta