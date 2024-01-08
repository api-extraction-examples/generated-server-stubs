from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.beta_build_localization_update_request_data_attributes import BetaBuildLocalizationUpdateRequestDataAttributes
from openapi_server import util

from openapi_server.models.beta_build_localization_update_request_data_attributes import BetaBuildLocalizationUpdateRequestDataAttributes  # noqa: E501

class BetaBuildLocalizationUpdateRequestData(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, attributes=None, id=None, type=None):  # noqa: E501
        """BetaBuildLocalizationUpdateRequestData - a model defined in OpenAPI

        :param attributes: The attributes of this BetaBuildLocalizationUpdateRequestData.  # noqa: E501
        :type attributes: BetaBuildLocalizationUpdateRequestDataAttributes
        :param id: The id of this BetaBuildLocalizationUpdateRequestData.  # noqa: E501
        :type id: str
        :param type: The type of this BetaBuildLocalizationUpdateRequestData.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'attributes': BetaBuildLocalizationUpdateRequestDataAttributes,
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
    def from_dict(cls, dikt) -> 'BetaBuildLocalizationUpdateRequestData':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BetaBuildLocalizationUpdateRequest_data of this BetaBuildLocalizationUpdateRequestData.  # noqa: E501
        :rtype: BetaBuildLocalizationUpdateRequestData
        """
        return util.deserialize_model(dikt, cls)

    @property
    def attributes(self) -> BetaBuildLocalizationUpdateRequestDataAttributes:
        """Gets the attributes of this BetaBuildLocalizationUpdateRequestData.


        :return: The attributes of this BetaBuildLocalizationUpdateRequestData.
        :rtype: BetaBuildLocalizationUpdateRequestDataAttributes
        """
        return self._attributes

    @attributes.setter
    def attributes(self, attributes: BetaBuildLocalizationUpdateRequestDataAttributes):
        """Sets the attributes of this BetaBuildLocalizationUpdateRequestData.


        :param attributes: The attributes of this BetaBuildLocalizationUpdateRequestData.
        :type attributes: BetaBuildLocalizationUpdateRequestDataAttributes
        """

        self._attributes = attributes

    @property
    def id(self) -> str:
        """Gets the id of this BetaBuildLocalizationUpdateRequestData.


        :return: The id of this BetaBuildLocalizationUpdateRequestData.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this BetaBuildLocalizationUpdateRequestData.


        :param id: The id of this BetaBuildLocalizationUpdateRequestData.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def type(self) -> str:
        """Gets the type of this BetaBuildLocalizationUpdateRequestData.


        :return: The type of this BetaBuildLocalizationUpdateRequestData.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this BetaBuildLocalizationUpdateRequestData.


        :param type: The type of this BetaBuildLocalizationUpdateRequestData.
        :type type: str
        """
        allowed_values = ["betaBuildLocalizations"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type
