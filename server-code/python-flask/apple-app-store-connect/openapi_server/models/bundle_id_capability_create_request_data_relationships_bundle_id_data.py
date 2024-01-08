from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class BundleIdCapabilityCreateRequestDataRelationshipsBundleIdData(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id=None, type=None):  # noqa: E501
        """BundleIdCapabilityCreateRequestDataRelationshipsBundleIdData - a model defined in OpenAPI

        :param id: The id of this BundleIdCapabilityCreateRequestDataRelationshipsBundleIdData.  # noqa: E501
        :type id: str
        :param type: The type of this BundleIdCapabilityCreateRequestDataRelationshipsBundleIdData.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'id': str,
            'type': str
        }

        self.attribute_map = {
            'id': 'id',
            'type': 'type'
        }

        self._id = id
        self._type = type

    @classmethod
    def from_dict(cls, dikt) -> 'BundleIdCapabilityCreateRequestDataRelationshipsBundleIdData':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BundleIdCapabilityCreateRequest_data_relationships_bundleId_data of this BundleIdCapabilityCreateRequestDataRelationshipsBundleIdData.  # noqa: E501
        :rtype: BundleIdCapabilityCreateRequestDataRelationshipsBundleIdData
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> str:
        """Gets the id of this BundleIdCapabilityCreateRequestDataRelationshipsBundleIdData.


        :return: The id of this BundleIdCapabilityCreateRequestDataRelationshipsBundleIdData.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this BundleIdCapabilityCreateRequestDataRelationshipsBundleIdData.


        :param id: The id of this BundleIdCapabilityCreateRequestDataRelationshipsBundleIdData.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def type(self) -> str:
        """Gets the type of this BundleIdCapabilityCreateRequestDataRelationshipsBundleIdData.


        :return: The type of this BundleIdCapabilityCreateRequestDataRelationshipsBundleIdData.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this BundleIdCapabilityCreateRequestDataRelationshipsBundleIdData.


        :param type: The type of this BundleIdCapabilityCreateRequestDataRelationshipsBundleIdData.
        :type type: str
        """
        allowed_values = ["bundleIds"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type