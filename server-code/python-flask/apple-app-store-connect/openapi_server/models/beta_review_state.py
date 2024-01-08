from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class BetaReviewState(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    WAITING_FOR_REVIEW = 'WAITING_FOR_REVIEW'
    IN_REVIEW = 'IN_REVIEW'
    REJECTED = 'REJECTED'
    APPROVED = 'APPROVED'
    def __init__(self):  # noqa: E501
        """BetaReviewState - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'BetaReviewState':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BetaReviewState of this BetaReviewState.  # noqa: E501
        :rtype: BetaReviewState
        """
        return util.deserialize_model(dikt, cls)
