from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.beta_app_localization_update_request_data_attributes import BetaAppLocalizationUpdateRequestDataAttributes
from openapi_server import util

from openapi_server.models.beta_app_localization_update_request_data_attributes import BetaAppLocalizationUpdateRequestDataAttributes  # noqa: E501

class BetaAppLocalizationUpdateRequestData(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, attributes=None, id=None, type=None):  # noqa: E501
        """BetaAppLocalizationUpdateRequestData - a model defined in OpenAPI

        :param attributes: The attributes of this BetaAppLocalizationUpdateRequestData.  # noqa: E501
        :type attributes: BetaAppLocalizationUpdateRequestDataAttributes
        :param id: The id of this BetaAppLocalizationUpdateRequestData.  # noqa: E501
        :type id: str
        :param type: The type of this BetaAppLocalizationUpdateRequestData.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'attributes': BetaAppLocalizationUpdateRequestDataAttributes,
            'id': str,
            'type': str
        }

        self.attribute_map = {
            'attributes': 'attributes',
            'id': 'id',
            'type': 'type'
        }

        self._attributes = attributes
        self._id = id
        self._type = type

    @classmethod
    def from_dict(cls, dikt) -> 'BetaAppLocalizationUpdateRequestData':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BetaAppLocalizationUpdateRequest_data of this BetaAppLocalizationUpdateRequestData.  # noqa: E501
        :rtype: BetaAppLocalizationUpdateRequestData
        """
        return util.deserialize_model(dikt, cls)

    @property
    def attributes(self) -> BetaAppLocalizationUpdateRequestDataAttributes:
        """Gets the attributes of this BetaAppLocalizationUpdateRequestData.


        :return: The attributes of this BetaAppLocalizationUpdateRequestData.
        :rtype: BetaAppLocalizationUpdateRequestDataAttributes
        """
        return self._attributes

    @attributes.setter
    def attributes(self, attributes: BetaAppLocalizationUpdateRequestDataAttributes):
        """Sets the attributes of this BetaAppLocalizationUpdateRequestData.


        :param attributes: The attributes of this BetaAppLocalizationUpdateRequestData.
        :type attributes: BetaAppLocalizationUpdateRequestDataAttributes
        """

        self._attributes = attributes

    @property
    def id(self) -> str:
        """Gets the id of this BetaAppLocalizationUpdateRequestData.


        :return: The id of this BetaAppLocalizationUpdateRequestData.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this BetaAppLocalizationUpdateRequestData.


        :param id: The id of this BetaAppLocalizationUpdateRequestData.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def type(self) -> str:
        """Gets the type of this BetaAppLocalizationUpdateRequestData.


        :return: The type of this BetaAppLocalizationUpdateRequestData.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this BetaAppLocalizationUpdateRequestData.


        :param type: The type of this BetaAppLocalizationUpdateRequestData.
        :type type: str
        """
        allowed_values = ["betaAppLocalizations"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type