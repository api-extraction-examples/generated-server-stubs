from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_screenshot_create_request_data_attributes import AppScreenshotCreateRequestDataAttributes
from openapi_server.models.app_store_review_detail_create_request_data_relationships import AppStoreReviewDetailCreateRequestDataRelationships
from openapi_server import util

from openapi_server.models.app_screenshot_create_request_data_attributes import AppScreenshotCreateRequestDataAttributes  # noqa: E501
from openapi_server.models.app_store_review_detail_create_request_data_relationships import AppStoreReviewDetailCreateRequestDataRelationships  # noqa: E501

class RoutingAppCoverageCreateRequestData(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, attributes=None, relationships=None, type=None):  # noqa: E501
        """RoutingAppCoverageCreateRequestData - a model defined in OpenAPI

        :param attributes: The attributes of this RoutingAppCoverageCreateRequestData.  # noqa: E501
        :type attributes: AppScreenshotCreateRequestDataAttributes
        :param relationships: The relationships of this RoutingAppCoverageCreateRequestData.  # noqa: E501
        :type relationships: AppStoreReviewDetailCreateRequestDataRelationships
        :param type: The type of this RoutingAppCoverageCreateRequestData.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'attributes': AppScreenshotCreateRequestDataAttributes,
            'relationships': AppStoreReviewDetailCreateRequestDataRelationships,
            'type': str
        }

        self.attribute_map = {
            'attributes': 'attributes',
            'relationships': 'relationships',
            'type': 'type'
        }

        self._attributes = attributes
        self._relationships = relationships
        self._type = type

    @classmethod
    def from_dict(cls, dikt) -> 'RoutingAppCoverageCreateRequestData':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The RoutingAppCoverageCreateRequest_data of this RoutingAppCoverageCreateRequestData.  # noqa: E501
        :rtype: RoutingAppCoverageCreateRequestData
        """
        return util.deserialize_model(dikt, cls)

    @property
    def attributes(self) -> AppScreenshotCreateRequestDataAttributes:
        """Gets the attributes of this RoutingAppCoverageCreateRequestData.


        :return: The attributes of this RoutingAppCoverageCreateRequestData.
        :rtype: AppScreenshotCreateRequestDataAttributes
        """
        return self._attributes

    @attributes.setter
    def attributes(self, attributes: AppScreenshotCreateRequestDataAttributes):
        """Sets the attributes of this RoutingAppCoverageCreateRequestData.


        :param attributes: The attributes of this RoutingAppCoverageCreateRequestData.
        :type attributes: AppScreenshotCreateRequestDataAttributes
        """
        if attributes is None:
            raise ValueError("Invalid value for `attributes`, must not be `None`")  # noqa: E501

        self._attributes = attributes

    @property
    def relationships(self) -> AppStoreReviewDetailCreateRequestDataRelationships:
        """Gets the relationships of this RoutingAppCoverageCreateRequestData.


        :return: The relationships of this RoutingAppCoverageCreateRequestData.
        :rtype: AppStoreReviewDetailCreateRequestDataRelationships
        """
        return self._relationships

    @relationships.setter
    def relationships(self, relationships: AppStoreReviewDetailCreateRequestDataRelationships):
        """Sets the relationships of this RoutingAppCoverageCreateRequestData.


        :param relationships: The relationships of this RoutingAppCoverageCreateRequestData.
        :type relationships: AppStoreReviewDetailCreateRequestDataRelationships
        """
        if relationships is None:
            raise ValueError("Invalid value for `relationships`, must not be `None`")  # noqa: E501

        self._relationships = relationships

    @property
    def type(self) -> str:
        """Gets the type of this RoutingAppCoverageCreateRequestData.


        :return: The type of this RoutingAppCoverageCreateRequestData.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this RoutingAppCoverageCreateRequestData.


        :param type: The type of this RoutingAppCoverageCreateRequestData.
        :type type: str
        """
        allowed_values = ["routingAppCoverages"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type
