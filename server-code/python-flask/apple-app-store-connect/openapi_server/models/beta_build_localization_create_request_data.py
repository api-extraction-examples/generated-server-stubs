from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.beta_app_review_submission_create_request_data_relationships import BetaAppReviewSubmissionCreateRequestDataRelationships
from openapi_server.models.beta_build_localization_create_request_data_attributes import BetaBuildLocalizationCreateRequestDataAttributes
from openapi_server import util

from openapi_server.models.beta_app_review_submission_create_request_data_relationships import BetaAppReviewSubmissionCreateRequestDataRelationships  # noqa: E501
from openapi_server.models.beta_build_localization_create_request_data_attributes import BetaBuildLocalizationCreateRequestDataAttributes  # noqa: E501

class BetaBuildLocalizationCreateRequestData(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, attributes=None, relationships=None, type=None):  # noqa: E501
        """BetaBuildLocalizationCreateRequestData - a model defined in OpenAPI

        :param attributes: The attributes of this BetaBuildLocalizationCreateRequestData.  # noqa: E501
        :type attributes: BetaBuildLocalizationCreateRequestDataAttributes
        :param relationships: The relationships of this BetaBuildLocalizationCreateRequestData.  # noqa: E501
        :type relationships: BetaAppReviewSubmissionCreateRequestDataRelationships
        :param type: The type of this BetaBuildLocalizationCreateRequestData.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'attributes': BetaBuildLocalizationCreateRequestDataAttributes,
            'relationships': BetaAppReviewSubmissionCreateRequestDataRelationships,
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
    def from_dict(cls, dikt) -> 'BetaBuildLocalizationCreateRequestData':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BetaBuildLocalizationCreateRequest_data of this BetaBuildLocalizationCreateRequestData.  # noqa: E501
        :rtype: BetaBuildLocalizationCreateRequestData
        """
        return util.deserialize_model(dikt, cls)

    @property
    def attributes(self) -> BetaBuildLocalizationCreateRequestDataAttributes:
        """Gets the attributes of this BetaBuildLocalizationCreateRequestData.


        :return: The attributes of this BetaBuildLocalizationCreateRequestData.
        :rtype: BetaBuildLocalizationCreateRequestDataAttributes
        """
        return self._attributes

    @attributes.setter
    def attributes(self, attributes: BetaBuildLocalizationCreateRequestDataAttributes):
        """Sets the attributes of this BetaBuildLocalizationCreateRequestData.


        :param attributes: The attributes of this BetaBuildLocalizationCreateRequestData.
        :type attributes: BetaBuildLocalizationCreateRequestDataAttributes
        """
        if attributes is None:
            raise ValueError("Invalid value for `attributes`, must not be `None`")  # noqa: E501

        self._attributes = attributes

    @property
    def relationships(self) -> BetaAppReviewSubmissionCreateRequestDataRelationships:
        """Gets the relationships of this BetaBuildLocalizationCreateRequestData.


        :return: The relationships of this BetaBuildLocalizationCreateRequestData.
        :rtype: BetaAppReviewSubmissionCreateRequestDataRelationships
        """
        return self._relationships

    @relationships.setter
    def relationships(self, relationships: BetaAppReviewSubmissionCreateRequestDataRelationships):
        """Sets the relationships of this BetaBuildLocalizationCreateRequestData.


        :param relationships: The relationships of this BetaBuildLocalizationCreateRequestData.
        :type relationships: BetaAppReviewSubmissionCreateRequestDataRelationships
        """
        if relationships is None:
            raise ValueError("Invalid value for `relationships`, must not be `None`")  # noqa: E501

        self._relationships = relationships

    @property
    def type(self) -> str:
        """Gets the type of this BetaBuildLocalizationCreateRequestData.


        :return: The type of this BetaBuildLocalizationCreateRequestData.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this BetaBuildLocalizationCreateRequestData.


        :param type: The type of this BetaBuildLocalizationCreateRequestData.
        :type type: str
        """
        allowed_values = ["betaBuildLocalizations"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type