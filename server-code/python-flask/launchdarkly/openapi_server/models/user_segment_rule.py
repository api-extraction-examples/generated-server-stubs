from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.clause import Clause
from openapi_server import util

from openapi_server.models.clause import Clause  # noqa: E501

class UserSegmentRule(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, bucket_by=None, clauses=None, weight=None):  # noqa: E501
        """UserSegmentRule - a model defined in OpenAPI

        :param bucket_by: The bucket_by of this UserSegmentRule.  # noqa: E501
        :type bucket_by: str
        :param clauses: The clauses of this UserSegmentRule.  # noqa: E501
        :type clauses: List[Clause]
        :param weight: The weight of this UserSegmentRule.  # noqa: E501
        :type weight: int
        """
        self.openapi_types = {
            'bucket_by': str,
            'clauses': List[Clause],
            'weight': int
        }

        self.attribute_map = {
            'bucket_by': 'bucketBy',
            'clauses': 'clauses',
            'weight': 'weight'
        }

        self._bucket_by = bucket_by
        self._clauses = clauses
        self._weight = weight

    @classmethod
    def from_dict(cls, dikt) -> 'UserSegmentRule':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The UserSegmentRule of this UserSegmentRule.  # noqa: E501
        :rtype: UserSegmentRule
        """
        return util.deserialize_model(dikt, cls)

    @property
    def bucket_by(self) -> str:
        """Gets the bucket_by of this UserSegmentRule.


        :return: The bucket_by of this UserSegmentRule.
        :rtype: str
        """
        return self._bucket_by

    @bucket_by.setter
    def bucket_by(self, bucket_by: str):
        """Sets the bucket_by of this UserSegmentRule.


        :param bucket_by: The bucket_by of this UserSegmentRule.
        :type bucket_by: str
        """

        self._bucket_by = bucket_by

    @property
    def clauses(self) -> List[Clause]:
        """Gets the clauses of this UserSegmentRule.


        :return: The clauses of this UserSegmentRule.
        :rtype: List[Clause]
        """
        return self._clauses

    @clauses.setter
    def clauses(self, clauses: List[Clause]):
        """Sets the clauses of this UserSegmentRule.


        :param clauses: The clauses of this UserSegmentRule.
        :type clauses: List[Clause]
        """

        self._clauses = clauses

    @property
    def weight(self) -> int:
        """Gets the weight of this UserSegmentRule.


        :return: The weight of this UserSegmentRule.
        :rtype: int
        """
        return self._weight

    @weight.setter
    def weight(self, weight: int):
        """Sets the weight of this UserSegmentRule.


        :param weight: The weight of this UserSegmentRule.
        :type weight: int
        """

        self._weight = weight
