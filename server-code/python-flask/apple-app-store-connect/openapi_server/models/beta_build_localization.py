from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.beta_app_review_submission_relationships import BetaAppReviewSubmissionRelationships
from openapi_server.models.beta_build_localization_attributes import BetaBuildLocalizationAttributes
from openapi_server.models.resource_links import ResourceLinks
from openapi_server import util

from openapi_server.models.beta_app_review_submission_relationships import BetaAppReviewSubmissionRelationships  # noqa: E501
from openapi_server.models.beta_build_localization_attributes import BetaBuildLocalizationAttributes  # noqa: E501
from openapi_server.models.resource_links import ResourceLinks  # noqa: E501

class BetaBuildLocalization(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, attributes=None, id=None, links=None, relationships=None, type=None):  # noqa: E501
        """BetaBuildLocalization - a model defined in OpenAPI

        :param attributes: The attributes of this BetaBuildLocalization.  # noqa: E501
        :type attributes: BetaBuildLocalizationAttributes
        :param id: The id of this BetaBuildLocalization.  # noqa: E501
        :type id: str
        :param links: The links of this BetaBuildLocalization.  # noqa: E501
        :type links: ResourceLinks
        :param relationships: The relationships of this BetaBuildLocalization.  # noqa: E501
        :type relationships: BetaAppReviewSubmissionRelationships
        :param type: The type of this BetaBuildLocalization.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'attributes': BetaBuildLocalizationAttributes,
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
    def from_dict(cls, dikt) -> 'BetaBuildLocalization':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BetaBuildLocalization of this BetaBuildLocalization.  # noqa: E501
        :rtype: BetaBuildLocalization
        """
        return util.deserialize_model(dikt, cls)

    @property
    def attributes(self) -> BetaBuildLocalizationAttributes:
        """Gets the attributes of this BetaBuildLocalization.


        :return: The attributes of this BetaBuildLocalization.
        :rtype: BetaBuildLocalizationAttributes
        """
        return self._attributes

    @attributes.setter
    def attributes(self, attributes: BetaBuildLocalizationAttributes):
        """Sets the attributes of this BetaBuildLocalization.


        :param attributes: The attributes of this BetaBuildLocalization.
        :type attributes: BetaBuildLocalizationAttributes
        """

        self._attributes = attributes

    @property
    def id(self) -> str:
        """Gets the id of this BetaBuildLocalization.


        :return: The id of this BetaBuildLocalization.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this BetaBuildLocalization.


        :param id: The id of this BetaBuildLocalization.
        :type id: str
        """
        if id is None:
            raise ValueError("Invalid value for `id`, must not be `None`")  # noqa: E501

        self._id = id

    @property
    def links(self) -> ResourceLinks:
        """Gets the links of this BetaBuildLocalization.


        :return: The links of this BetaBuildLocalization.
        :rtype: ResourceLinks
        """
        return self._links

    @links.setter
    def links(self, links: ResourceLinks):
        """Sets the links of this BetaBuildLocalization.


        :param links: The links of this BetaBuildLocalization.
        :type links: ResourceLinks
        """
        if links is None:
            raise ValueError("Invalid value for `links`, must not be `None`")  # noqa: E501

        self._links = links

    @property
    def relationships(self) -> BetaAppReviewSubmissionRelationships:
        """Gets the relationships of this BetaBuildLocalization.


        :return: The relationships of this BetaBuildLocalization.
        :rtype: BetaAppReviewSubmissionRelationships
        """
        return self._relationships

    @relationships.setter
    def relationships(self, relationships: BetaAppReviewSubmissionRelationships):
        """Sets the relationships of this BetaBuildLocalization.


        :param relationships: The relationships of this BetaBuildLocalization.
        :type relationships: BetaAppReviewSubmissionRelationships
        """

        self._relationships = relationships

    @property
    def type(self) -> str:
        """Gets the type of this BetaBuildLocalization.


        :return: The type of this BetaBuildLocalization.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this BetaBuildLocalization.


        :param type: The type of this BetaBuildLocalization.
        :type type: str
        """
        allowed_values = ["betaBuildLocalizations"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type