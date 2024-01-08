from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_info_relationships_age_rating_declaration_data import AppInfoRelationshipsAgeRatingDeclarationData
from openapi_server.models.app_relationships_app_infos_links import AppRelationshipsAppInfosLinks
from openapi_server import util

from openapi_server.models.app_info_relationships_age_rating_declaration_data import AppInfoRelationshipsAgeRatingDeclarationData  # noqa: E501
from openapi_server.models.app_relationships_app_infos_links import AppRelationshipsAppInfosLinks  # noqa: E501

class AppStoreVersionRelationshipsAgeRatingDeclaration(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None, links=None):  # noqa: E501
        """AppStoreVersionRelationshipsAgeRatingDeclaration - a model defined in OpenAPI

        :param data: The data of this AppStoreVersionRelationshipsAgeRatingDeclaration.  # noqa: E501
        :type data: AppInfoRelationshipsAgeRatingDeclarationData
        :param links: The links of this AppStoreVersionRelationshipsAgeRatingDeclaration.  # noqa: E501
        :type links: AppRelationshipsAppInfosLinks
        """
        self.openapi_types = {
            'data': AppInfoRelationshipsAgeRatingDeclarationData,
            'links': AppRelationshipsAppInfosLinks
        }

        self.attribute_map = {
            'data': 'data',
            'links': 'links'
        }

        self._data = data
        self._links = links

    @classmethod
    def from_dict(cls, dikt) -> 'AppStoreVersionRelationshipsAgeRatingDeclaration':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppStoreVersion_relationships_ageRatingDeclaration of this AppStoreVersionRelationshipsAgeRatingDeclaration.  # noqa: E501
        :rtype: AppStoreVersionRelationshipsAgeRatingDeclaration
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> AppInfoRelationshipsAgeRatingDeclarationData:
        """Gets the data of this AppStoreVersionRelationshipsAgeRatingDeclaration.


        :return: The data of this AppStoreVersionRelationshipsAgeRatingDeclaration.
        :rtype: AppInfoRelationshipsAgeRatingDeclarationData
        """
        return self._data

    @data.setter
    def data(self, data: AppInfoRelationshipsAgeRatingDeclarationData):
        """Sets the data of this AppStoreVersionRelationshipsAgeRatingDeclaration.


        :param data: The data of this AppStoreVersionRelationshipsAgeRatingDeclaration.
        :type data: AppInfoRelationshipsAgeRatingDeclarationData
        """

        self._data = data

    @property
    def links(self) -> AppRelationshipsAppInfosLinks:
        """Gets the links of this AppStoreVersionRelationshipsAgeRatingDeclaration.


        :return: The links of this AppStoreVersionRelationshipsAgeRatingDeclaration.
        :rtype: AppRelationshipsAppInfosLinks
        """
        return self._links

    @links.setter
    def links(self, links: AppRelationshipsAppInfosLinks):
        """Sets the links of this AppStoreVersionRelationshipsAgeRatingDeclaration.


        :param links: The links of this AppStoreVersionRelationshipsAgeRatingDeclaration.
        :type links: AppRelationshipsAppInfosLinks
        """

        self._links = links
