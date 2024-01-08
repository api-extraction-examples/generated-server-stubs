from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_relationships_app_infos_links import AppRelationshipsAppInfosLinks
from openapi_server.models.build_relationships_beta_app_review_submission_data import BuildRelationshipsBetaAppReviewSubmissionData
from openapi_server import util

from openapi_server.models.app_relationships_app_infos_links import AppRelationshipsAppInfosLinks  # noqa: E501
from openapi_server.models.build_relationships_beta_app_review_submission_data import BuildRelationshipsBetaAppReviewSubmissionData  # noqa: E501

class BuildRelationshipsBetaAppReviewSubmission(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, data=None, links=None):  # noqa: E501
        """BuildRelationshipsBetaAppReviewSubmission - a model defined in OpenAPI

        :param data: The data of this BuildRelationshipsBetaAppReviewSubmission.  # noqa: E501
        :type data: BuildRelationshipsBetaAppReviewSubmissionData
        :param links: The links of this BuildRelationshipsBetaAppReviewSubmission.  # noqa: E501
        :type links: AppRelationshipsAppInfosLinks
        """
        self.openapi_types = {
            'data': BuildRelationshipsBetaAppReviewSubmissionData,
            'links': AppRelationshipsAppInfosLinks
        }

        self.attribute_map = {
            'data': 'data',
            'links': 'links'
        }

        self._data = data
        self._links = links

    @classmethod
    def from_dict(cls, dikt) -> 'BuildRelationshipsBetaAppReviewSubmission':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Build_relationships_betaAppReviewSubmission of this BuildRelationshipsBetaAppReviewSubmission.  # noqa: E501
        :rtype: BuildRelationshipsBetaAppReviewSubmission
        """
        return util.deserialize_model(dikt, cls)

    @property
    def data(self) -> BuildRelationshipsBetaAppReviewSubmissionData:
        """Gets the data of this BuildRelationshipsBetaAppReviewSubmission.


        :return: The data of this BuildRelationshipsBetaAppReviewSubmission.
        :rtype: BuildRelationshipsBetaAppReviewSubmissionData
        """
        return self._data

    @data.setter
    def data(self, data: BuildRelationshipsBetaAppReviewSubmissionData):
        """Sets the data of this BuildRelationshipsBetaAppReviewSubmission.


        :param data: The data of this BuildRelationshipsBetaAppReviewSubmission.
        :type data: BuildRelationshipsBetaAppReviewSubmissionData
        """

        self._data = data

    @property
    def links(self) -> AppRelationshipsAppInfosLinks:
        """Gets the links of this BuildRelationshipsBetaAppReviewSubmission.


        :return: The links of this BuildRelationshipsBetaAppReviewSubmission.
        :rtype: AppRelationshipsAppInfosLinks
        """
        return self._links

    @links.setter
    def links(self, links: AppRelationshipsAppInfosLinks):
        """Sets the links of this BuildRelationshipsBetaAppReviewSubmission.


        :param links: The links of this BuildRelationshipsBetaAppReviewSubmission.
        :type links: AppRelationshipsAppInfosLinks
        """

        self._links = links