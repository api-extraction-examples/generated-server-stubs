from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.beta_app_review_submission_create_request_data_relationships_build import BetaAppReviewSubmissionCreateRequestDataRelationshipsBuild
from openapi_server import util

from openapi_server.models.beta_app_review_submission_create_request_data_relationships_build import BetaAppReviewSubmissionCreateRequestDataRelationshipsBuild  # noqa: E501

class BetaAppReviewSubmissionCreateRequestDataRelationships(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, build=None):  # noqa: E501
        """BetaAppReviewSubmissionCreateRequestDataRelationships - a model defined in OpenAPI

        :param build: The build of this BetaAppReviewSubmissionCreateRequestDataRelationships.  # noqa: E501
        :type build: BetaAppReviewSubmissionCreateRequestDataRelationshipsBuild
        """
        self.openapi_types = {
            'build': BetaAppReviewSubmissionCreateRequestDataRelationshipsBuild
        }

        self.attribute_map = {
            'build': 'build'
        }

        self._build = build

    @classmethod
    def from_dict(cls, dikt) -> 'BetaAppReviewSubmissionCreateRequestDataRelationships':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BetaAppReviewSubmissionCreateRequest_data_relationships of this BetaAppReviewSubmissionCreateRequestDataRelationships.  # noqa: E501
        :rtype: BetaAppReviewSubmissionCreateRequestDataRelationships
        """
        return util.deserialize_model(dikt, cls)

    @property
    def build(self) -> BetaAppReviewSubmissionCreateRequestDataRelationshipsBuild:
        """Gets the build of this BetaAppReviewSubmissionCreateRequestDataRelationships.


        :return: The build of this BetaAppReviewSubmissionCreateRequestDataRelationships.
        :rtype: BetaAppReviewSubmissionCreateRequestDataRelationshipsBuild
        """
        return self._build

    @build.setter
    def build(self, build: BetaAppReviewSubmissionCreateRequestDataRelationshipsBuild):
        """Sets the build of this BetaAppReviewSubmissionCreateRequestDataRelationships.


        :param build: The build of this BetaAppReviewSubmissionCreateRequestDataRelationships.
        :type build: BetaAppReviewSubmissionCreateRequestDataRelationshipsBuild
        """
        if build is None:
            raise ValueError("Invalid value for `build`, must not be `None`")  # noqa: E501

        self._build = build
