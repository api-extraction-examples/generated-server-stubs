from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_preview_relationships_app_preview_set_data import AppPreviewRelationshipsAppPreviewSetData
from openapi_server import util

from openapi_server.models.app_preview_relationships_app_preview_set_data import AppPreviewRelationshipsAppPreviewSetData  # noqa: E501

class AppPreviewCreateRequestDataRelationshipsAppPreviewSet(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """AppPreviewCreateRequestDataRelationshipsAppPreviewSet - a model defined in OpenAPI

        :param data: The data of this AppPreviewCreateRequestDataRelationshipsAppPreviewSet.  # noqa: E501
        :type data: AppPreviewRelationshipsAppPreviewSetData
        """
        self.openapi_types = {
            'data': AppPreviewRelationshipsAppPreviewSetData
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'AppPreviewCreateRequestDataRelationshipsAppPreviewSet':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppPreviewCreateRequest_data_relationships_appPreviewSet of this AppPreviewCreateRequestDataRelationshipsAppPreviewSet.  # noqa: E501
        :rtype: AppPreviewCreateRequestDataRelationshipsAppPreviewSet
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> AppPreviewRelationshipsAppPreviewSetData:
        """Gets the data of this AppPreviewCreateRequestDataRelationshipsAppPreviewSet.


        :return: The data of this AppPreviewCreateRequestDataRelationshipsAppPreviewSet.
        :rtype: AppPreviewRelationshipsAppPreviewSetData
        """
        return self._data

    @data.setter
    def data(self, data: AppPreviewRelationshipsAppPreviewSetData):
        """Sets the data of this AppPreviewCreateRequestDataRelationshipsAppPreviewSet.


        :param data: The data of this AppPreviewCreateRequestDataRelationshipsAppPreviewSet.
        :type data: AppPreviewRelationshipsAppPreviewSetData
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data