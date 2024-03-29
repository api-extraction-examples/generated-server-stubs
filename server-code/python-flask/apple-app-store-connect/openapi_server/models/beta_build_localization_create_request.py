from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.beta_build_localization_create_request_data import BetaBuildLocalizationCreateRequestData
from openapi_server import util

from openapi_server.models.beta_build_localization_create_request_data import BetaBuildLocalizationCreateRequestData  # noqa: E501

class BetaBuildLocalizationCreateRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None):  # noqa: E501
        """BetaBuildLocalizationCreateRequest - a model defined in OpenAPI

        :param data: The data of this BetaBuildLocalizationCreateRequest.  # noqa: E501
        :type data: BetaBuildLocalizationCreateRequestData
        """
        self.openapi_types = {
            'data': BetaBuildLocalizationCreateRequestData
        }

        self.attribute_map = {
            'data': 'data'
        }

        self._data = data

    @classmethod
    def from_dict(cls, dikt) -> 'BetaBuildLocalizationCreateRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BetaBuildLocalizationCreateRequest of this BetaBuildLocalizationCreateRequest.  # noqa: E501
        :rtype: BetaBuildLocalizationCreateRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> BetaBuildLocalizationCreateRequestData:
        """Gets the data of this BetaBuildLocalizationCreateRequest.


        :return: The data of this BetaBuildLocalizationCreateRequest.
        :rtype: BetaBuildLocalizationCreateRequestData
        """
        return self._data

    @data.setter
    def data(self, data: BetaBuildLocalizationCreateRequestData):
        """Sets the data of this BetaBuildLocalizationCreateRequest.


        :param data: The data of this BetaBuildLocalizationCreateRequest.
        :type data: BetaBuildLocalizationCreateRequestData
        """
        if data is None:
            raise ValueError("Invalid value for `data`, must not be `None`")  # noqa: E501

        self._data = data
