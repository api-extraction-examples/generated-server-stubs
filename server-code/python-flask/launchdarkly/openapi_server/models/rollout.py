from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.weighted_variation import WeightedVariation
from openapi_server import util

from openapi_server.models.weighted_variation import WeightedVariation  # noqa: E501

class Rollout(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, bucket_by=None, variations=None):  # noqa: E501
        """Rollout - a model defined in OpenAPI

        :param bucket_by: The bucket_by of this Rollout.  # noqa: E501
        :type bucket_by: str
        :param variations: The variations of this Rollout.  # noqa: E501
        :type variations: List[WeightedVariation]
        """
        self.openapi_types = {
            'bucket_by': str,
            'variations': List[WeightedVariation]
        }

        self.attribute_map = {
            'bucket_by': 'bucketBy',
            'variations': 'variations'
        }

        self._bucket_by = bucket_by
        self._variations = variations

    @classmethod
    def from_dict(cls, dikt) -> 'Rollout':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Rollout of this Rollout.  # noqa: E501
        :rtype: Rollout
        """
        return util.deserialize_model(dikt, cls)

    @property
    def bucket_by(self) -> str:
        """Gets the bucket_by of this Rollout.


        :return: The bucket_by of this Rollout.
        :rtype: str
        """
        return self._bucket_by

    @bucket_by.setter
    def bucket_by(self, bucket_by: str):
        """Sets the bucket_by of this Rollout.


        :param bucket_by: The bucket_by of this Rollout.
        :type bucket_by: str
        """

        self._bucket_by = bucket_by

    @property
    def variations(self) -> List[WeightedVariation]:
        """Gets the variations of this Rollout.


        :return: The variations of this Rollout.
        :rtype: List[WeightedVariation]
        """
        return self._variations

    @variations.setter
    def variations(self, variations: List[WeightedVariation]):
        """Sets the variations of this Rollout.


        :param variations: The variations of this Rollout.
        :type variations: List[WeightedVariation]
        """

        self._variations = variations
