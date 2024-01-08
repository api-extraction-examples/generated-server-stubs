from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class AppStoreAgeRating(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    """
    allowed enum values
    """
    FOUR_PLUS = 'FOUR_PLUS'
    NINE_PLUS = 'NINE_PLUS'
    TWELVE_PLUS = 'TWELVE_PLUS'
    SEVENTEEN_PLUS = 'SEVENTEEN_PLUS'
    def __init__(self):  # noqa: E501
        """AppStoreAgeRating - a model defined in OpenAPI

        """
        self.openapi_types = {
        }

        self.attribute_map = {
        }

    @classmethod
    def from_dict(cls, dikt) -> 'AppStoreAgeRating':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppStoreAgeRating of this AppStoreAgeRating.  # noqa: E501
        :rtype: AppStoreAgeRating
        """
        return util.deserialize_model(dikt, cls)
