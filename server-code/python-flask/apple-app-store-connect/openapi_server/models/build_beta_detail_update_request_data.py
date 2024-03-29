from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.build_beta_detail_update_request_data_attributes import BuildBetaDetailUpdateRequestDataAttributes
from openapi_server import util

from openapi_server.models.build_beta_detail_update_request_data_attributes import BuildBetaDetailUpdateRequestDataAttributes  # noqa: E501

class BuildBetaDetailUpdateRequestData(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, attributes=None, id=None, type=None):  # noqa: E501
        """BuildBetaDetailUpdateRequestData - a model defined in OpenAPI

        :param attributes: The attributes of this BuildBetaDetailUpdateRequestData.  # noqa: E501
        :type attributes: BuildBetaDetailUpdateRequestDataAttributes
        :param id: The id of this BuildBetaDetailUpdateRequestData.  # noqa: E501
        :type id: str
        :param type: The type of this BuildBetaDetailUpdateRequestData.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'attributes': BuildBetaDetailUpdateRequestDataAttributes,
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
    def from_dict(cls, dikt) -> 'BuildBetaDetailUpdateRequestData':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BuildBetaDetailUpdateRequest_data of this BuildBetaDetailUpdateRequestData.  # noqa: E501
        :rtype: BuildBetaDetailUpdateRequestData
        """
        return util.deserialize_model(dikt, cls)

    @property
    def attributes(self) -> BuildBetaDetailUpdateRequestDataAttributes:
        """Gets the attributes of this BuildBetaDetailUpdateRequestData.


        :return: The attributes of this BuildBetaDetailUpdateRequestData.
        :rtype: BuildBetaDetailUpdateRequestDataAttributes
        """
        return self._attributes

    @attributes.setter
    def attributes(self, attributes: BuildBetaDetailUpdateRequestDataAttributes):
        """Sets the attributes of this BuildBetaDetailUpdateRequestData.


        :param attributes: The attributes of this BuildBetaDetailUpdateRequestData.
        :type attributes: BuildBetaDetailUpdateRequestDataAttributes
        """

        self._attributes = attributes

    @property
    def id(self) -> str:
        """Gets the id of this BuildBetaDetailUpdateRequestData.


        :return: The id of this BuildBetaDetailUpdateRequestData.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this BuildBetaDetailUpdateRequestData.


        :param id: The id of this BuildBetaDetailUpdateRequestData.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def type(self) -> str:
        """Gets the type of this BuildBetaDetailUpdateRequestData.


        :return: The type of this BuildBetaDetailUpdateRequestData.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this BuildBetaDetailUpdateRequestData.


        :param type: The type of this BuildBetaDetailUpdateRequestData.
        :type type: str
        """
        allowed_values = ["buildBetaDetails"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type
