import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.post_payments_sepa_credit_transfers_consents_ok_body import PostPaymentsSepaCreditTransfersConsentsOKBody  # noqa: E501
from openapi_server.models.post_payments_sepa_credit_transfers_consents_params_body import PostPaymentsSepaCreditTransfersConsentsParamsBody  # noqa: E501
from openapi_server import util


def payments_sepa_credit_transfers_consents_post(body):  # noqa: E501
    """Request consent initiation via redirect

    Request a SEPA credit transfer consent on behalf of the PSU via a URL redirect to the ASPSP. # noqa: E501

    :param body: 
    :type body: dict | bytes

    :rtype: Union[PostPaymentsSepaCreditTransfersConsentsOKBody, Tuple[PostPaymentsSepaCreditTransfersConsentsOKBody, int], Tuple[PostPaymentsSepaCreditTransfersConsentsOKBody, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        body = PostPaymentsSepaCreditTransfersConsentsParamsBody.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
