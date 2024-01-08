from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.beta_app_review_submission_attributes import BetaAppReviewSubmissionAttributes
from openapi_server.models.beta_app_review_submission_relationships import BetaAppReviewSubmissionRelationships
from openapi_server.models.resource_links import ResourceLinks
from openapi_server import util

from openapi_server.models.beta_app_review_submission_attributes import BetaAppReviewSubmissionAttributes  # noqa: E501
from openapi_server.models.beta_app_review_submission_relationships import BetaAppReviewSubmissionRelationships  # noqa: E501
from openapi_server.models.resource_links import ResourceLinks  # noqa: E501

class BetaAppReviewSubmission(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, attributes=None, id=None, links=None, relationships=None, type=None):  # noqa: E501
        """BetaAppReviewSubmission - a model defined in OpenAPI

        :param attributes: The attributes of this BetaAppReviewSubmission.  # noqa: E501
        :type attributes: BetaAppReviewSubmissionAttributes
        :param id: The id of this BetaAppReviewSubmission.  # noqa: E501
        :type id: str
        :param links: The links of this BetaAppReviewSubmission.  # noqa: E501
        :type links: ResourceLinks
        :param relationships: The relationships of this BetaAppReviewSubmission.  # noqa: E501
        :type relationships: BetaAppReviewSubmissionRelationships
        :param type: The type of this BetaAppReviewSubmission.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'attributes': BetaAppReviewSubmissionAttributes,
            'id': str,
            'links': ResourceLinks,
            'relationships': BetaAppReviewSubmissionRelationships,
            'type': str
        }

        self.attribute_map = {
            'attributes': 'attributes',
            'id': 'id',
            'links': 'links',
            'relationships': 'relationships',
            'type': 'type'
        }

        self._attributes = attributes
        self._id = id
        self._links = links
        self._relationships = relationships
        self._type = type

    @classmethod
    def from_dict(cls, dikt) -> 'BetaAppReviewSubmission':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BetaAppReviewSubmission of this BetaAppReviewSubmission.  # noqa: E501
        :rtype: BetaAppReviewSubmission
        """
        return util.deserialize_model(dikt, cls)

    @property
    def attributes(self) -> BetaAppReviewSubmissionAttributes:
        """Gets the attributes of this BetaAppReviewSubmission.


        :return: The attributes of this BetaAppReviewSubmission.
        :rtype: BetaAppReviewSubmissionAttributes
        """
        return self._attributes

    @attributes.setter
    def attributes(self, attributes: BetaAppReviewSubmissionAttributes):
        """Sets the attributes of this BetaAppReviewSubmission.


        :param attributes: The attributes of this BetaAppReviewSubmission.
        :type attributes: BetaAppReviewSubmissionAttributes
        """

        self._attributes = attributes

    @property
    def id(self) -> str:
        """Gets the id of this BetaAppReviewSubmission.


        :return: The id of this BetaAppReviewSubmission.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this BetaAppReviewSubmission.


        :param id: The id of this BetaAppReviewSubmission.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def links(self) -> ResourceLinks:
        """Gets the links of this BetaAppReviewSubmission.


        :return: The links of this BetaAppReviewSubmission.
        :rtype: ResourceLinks
        """
        return self._links

    @links.setter
    def links(self, links: ResourceLinks):
        """Sets the links of this BetaAppReviewSubmission.


        :param links: The links of this BetaAppReviewSubmission.
        :type links: ResourceLinks
        """
        if links is None:
            raise ValueError("Invalid value for `links`, must not be `None`")  # noqa: E501

        self._links = links

    @property
    def relationships(self) -> BetaAppReviewSubmissionRelationships:
        """Gets the relationships of this BetaAppReviewSubmission.


        :return: The relationships of this BetaAppReviewSubmission.
        :rtype: BetaAppReviewSubmissionRelationships
        """
        return self._relationships

    @relationships.setter
    def relationships(self, relationships: BetaAppReviewSubmissionRelationships):
        """Sets the relationships of this BetaAppReviewSubmission.


        :param relationships: The relationships of this BetaAppReviewSubmission.
        :type relationships: BetaAppReviewSubmissionRelationships
        """

        self._relationships = relationships

    @property
    def type(self) -> str:
        """Gets the type of this BetaAppReviewSubmission.


        :return: The type of this BetaAppReviewSubmission.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this BetaAppReviewSubmission.


        :param type: The type of this BetaAppReviewSubmission.
        :type type: str
        """
        allowed_values = ["betaAppReviewSubmissions"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type
