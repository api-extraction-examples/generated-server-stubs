import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.bill_publication_list import BillPublicationList  # noqa: E501
from openapi_server.models.bill_stage_publication_list import BillStagePublicationList  # noqa: E501
from openapi_server.models.problem_details import ProblemDetails  # noqa: E501
from openapi_server import util


def api_v1_bills_bill_id_stages_stage_id_publications_get(bill_id, stage_id):  # noqa: E501
    """Return a list of Bill stage publications.

     # noqa: E501

    :param bill_id: 
    :type bill_id: int
    :param stage_id: 
    :type stage_id: int

    :rtype: Union[BillStagePublicationList, Tuple[BillStagePublicationList, int], Tuple[BillStagePublicationList, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_bill_publication(bill_id):  # noqa: E501
    """Return a list of Bill publications.

     # noqa: E501

    :param bill_id: Publications relating to Bill with Bill ID specified
    :type bill_id: int

    :rtype: Union[BillPublicationList, Tuple[BillPublicationList, int], Tuple[BillPublicationList, int, Dict[str, str]]
    """
    return 'do some magic!'
