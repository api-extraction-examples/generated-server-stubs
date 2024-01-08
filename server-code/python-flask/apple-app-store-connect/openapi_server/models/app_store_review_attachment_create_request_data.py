from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_screenshot_create_request_data_attributes import AppScreenshotCreateRequestDataAttributes
from openapi_server.models.app_store_review_attachment_create_request_data_relationships import AppStoreReviewAttachmentCreateRequestDataRelationships
from openapi_server import util

from openapi_server.models.app_screenshot_create_request_data_attributes import AppScreenshotCreateRequestDataAttributes  # noqa: E501
from openapi_server.models.app_store_review_attachment_create_request_data_relationships import AppStoreReviewAttachmentCreateRequestDataRelationships  # noqa: E501

class AppStoreReviewAttachmentCreateRequestData(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, attributes=None, relationships=None, type=None):  # noqa: E501
        """AppStoreReviewAttachmentCreateRequestData - a model defined in OpenAPI

        :param attributes: The attributes of this AppStoreReviewAttachmentCreateRequestData.  # noqa: E501
        :type attributes: AppScreenshotCreateRequestDataAttributes
        :param relationships: The relationships of this AppStoreReviewAttachmentCreateRequestData.  # noqa: E501
        :type relationships: AppStoreReviewAttachmentCreateRequestDataRelationships
        :param type: The type of this AppStoreReviewAttachmentCreateRequestData.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'attributes': AppScreenshotCreateRequestDataAttributes,
            'relationships': AppStoreReviewAttachmentCreateRequestDataRelationships,
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
    def from_dict(cls, dikt) -> 'AppStoreReviewAttachmentCreateRequestData':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppStoreReviewAttachmentCreateRequest_data of this AppStoreReviewAttachmentCreateRequestData.  # noqa: E501
        :rtype: AppStoreReviewAttachmentCreateRequestData
        """
        return util.deserialize_model(dikt, cls)

    @property
    def attributes(self) -> AppScreenshotCreateRequestDataAttributes:
        """Gets the attributes of this AppStoreReviewAttachmentCreateRequestData.


        :return: The attributes of this AppStoreReviewAttachmentCreateRequestData.
        :rtype: AppScreenshotCreateRequestDataAttributes
        """
        return self._attributes

    @attributes.setter
    def attributes(self, attributes: AppScreenshotCreateRequestDataAttributes):
        """Sets the attributes of this AppStoreReviewAttachmentCreateRequestData.


        :param attributes: The attributes of this AppStoreReviewAttachmentCreateRequestData.
        :type attributes: AppScreenshotCreateRequestDataAttributes
        """
        if attributes is None:
            raise ValueError("Invalid value for `attributes`, must not be `None`")  # noqa: E501

        self._attributes = attributes

    @property
    def relationships(self) -> AppStoreReviewAttachmentCreateRequestDataRelationships:
        """Gets the relationships of this AppStoreReviewAttachmentCreateRequestData.


        :return: The relationships of this AppStoreReviewAttachmentCreateRequestData.
        :rtype: AppStoreReviewAttachmentCreateRequestDataRelationships
        """
        return self._relationships

    @relationships.setter
    def relationships(self, relationships: AppStoreReviewAttachmentCreateRequestDataRelationships):
        """Sets the relationships of this AppStoreReviewAttachmentCreateRequestData.


        :param relationships: The relationships of this AppStoreReviewAttachmentCreateRequestData.
        :type relationships: AppStoreReviewAttachmentCreateRequestDataRelationships
        """
        if relationships is None:
            raise ValueError("Invalid value for `relationships`, must not be `None`")  # noqa: E501

        self._relationships = relationships

    @property
    def type(self) -> str:
        """Gets the type of this AppStoreReviewAttachmentCreateRequestData.


        :return: The type of this AppStoreReviewAttachmentCreateRequestData.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this AppStoreReviewAttachmentCreateRequestData.


        :param type: The type of this AppStoreReviewAttachmentCreateRequestData.
        :type type: str
        """
        allowed_values = ["appStoreReviewAttachments"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type