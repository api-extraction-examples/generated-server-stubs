from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_relationships_available_territories_data_inner import AppRelationshipsAvailableTerritoriesDataInner
from openapi_server import util

from openapi_server.models.app_relationships_available_territories_data_inner import AppRelationshipsAvailableTerritoriesDataInner  # noqa: E501

class AppUpdateRequestDataRelationshipsAvailableTerritories(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """AppUpdateRequestDataRelationshipsAvailableTerritories - a model defined in OpenAPI

        :param data: The data of this AppUpdateRequestDataRelationshipsAvailableTerritories.  # noqa: E501
        :type data: List[AppRelationshipsAvailableTerritoriesDataInner]
        """
        self.openapi_types = {
            'data': List[AppRelationshipsAvailableTerritoriesDataInner]
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'AppUpdateRequestDataRelationshipsAvailableTerritories':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppUpdateRequest_data_relationships_availableTerritories of this AppUpdateRequestDataRelationshipsAvailableTerritories.  # noqa: E501
        :rtype: AppUpdateRequestDataRelationshipsAvailableTerritories
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> List[AppRelationshipsAvailableTerritoriesDataInner]:
        """Gets the data of this AppUpdateRequestDataRelationshipsAvailableTerritories.


        :return: The data of this AppUpdateRequestDataRelationshipsAvailableTerritories.
        :rtype: List[AppRelationshipsAvailableTerritoriesDataInner]
        """
        return self._data

    @data.setter
    def data(self, data: List[AppRelationshipsAvailableTerritoriesDataInner]):
        """Sets the data of this AppUpdateRequestDataRelationshipsAvailableTerritories.


        :param data: The data of this AppUpdateRequestDataRelationshipsAvailableTerritories.
        :type data: List[AppRelationshipsAvailableTerritoriesDataInner]
        """

        self._data = data
